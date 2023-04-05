package com.example.showpic

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var currentImage = 0
    private lateinit var imageView: ImageView
    private val imageArray = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.imageView)
    }

    fun nextImage(view: View?) {
        currentImage++
        currentImage %= imageArray.size
        imageView.setImageResource(imageArray[currentImage])
    }

    fun prevImage(view: View?) {
        currentImage--
        if (currentImage < 0) {
            currentImage = imageArray.size - 1
        }
        imageView.setImageResource(imageArray[currentImage])
    }
}