package com.example.myfirstapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //khởi tạo viewbinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //add addEvents
        addEvents()
    }

    private fun addEvents() {
        //xử lý sự kiện khi click chọn sở thích
        binding.btnAccept.setOnClickListener(
            this.xuLyChonSoThich()
        )
        binding.btnAccept.setOnClickListener {
            xuLyChonSoThich()
        }
    }

    private fun xuLyChonSoThich(): View.OnClickListener? {
        var s: String = "Sở thích của chú em là: " + "\n"
        if (binding.chkMusic.isChecked) {
            s += binding.chkMusic.text.toString() + ", "
        }
        if (binding.chkMovie.isChecked) {
            s += binding.chkMovie.text.toString() + ", "
        }
        if (
            binding.chkFootball.isChecked) {
            s += binding.chkFootball.text.toString() + ", "
        }
        if (binding.chkKaraoke.isChecked) {
            s += binding.chkKaraoke.text.toString()
        }
        binding.txbResult.text = s
        return null
    }
}