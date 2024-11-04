package com.example.emailrecycleview

import EmailAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emailrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterEmail = EmailAdapter(generateDummy()) { Email ->
            // When an item is clicked, send data to DetailActivity
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Name", Email.name)
            intent.putExtra("date", Email.date)
            intent.putExtra("description", Email.description)
            startActivity(intent)
        }


    with(binding){
            recyclerView.apply {
                adapter = adapterEmail
                layoutManager = LinearLayoutManager(this@MainActivity)

            }
        }

    }
    private fun generateDummy(): List<Email> {
        return listOf(
            Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",  "20 Oct", "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),
            Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",  "20 Oct", "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),
            Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",  "20 Oct", "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",  "20 Oct", "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),
            Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",      "20 Oct", "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),
            Email("fefefufu", "20 Oct", "Pemberitahuan: Sarapan gratis akan segera dimulai! Kami mengundang semua tamu untuk bergabung dan menikmati hidangan pagi yang telah disediakan. Silakan menuju area sarapan yang telah ditentukan, dan nikmati pilihan menu yang tersedia. Pastikan untuk datang tepat waktu agar dapat menikmati sarapan bersama. Selamat menikmati!"),
            Email("Ronaldo","20 Oct", "Saya adalah yang goat terbaik sepanjang masa tidak ada yang bisa menandingi saya ronaldo "),
            Email("Messi",  "20 Oct",   "Apa yang dia ronaldo tidaklah benar dia hanya mengjayal saya lah the greates of all time"),

            // Add more emails as needed
        )
    }
}