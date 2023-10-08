package com.yana.ood_strategy

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yana.ood_strategy.databinding.ActivityMainBinding
import com.yana.ood_strategy.painter.CatPawPrinter
import com.yana.ood_strategy.painter.Eraser
import com.yana.ood_strategy.painter.Marker
import com.yana.ood_strategy.painter.Rainbow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)

        with(binding) {
            marker.setOnClickListener {
                canvas.setPainter(Marker(Color.BLACK))
            }
            eraser.setOnClickListener {
                canvas.setPainter(Marker(Color.BLACK))
            }
            catPaw.setOnClickListener {
                canvas.setPainter(CatPawPrinter(this@MainActivity))
            }
            rainbow.setOnClickListener {
                canvas.setPainter(Rainbow())
            }
        }
    }

}