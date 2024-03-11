package com.example.cardview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.airbnb.lottie.LottieAnimationView


class MainActivity : AppCompatActivity() {
    private var cardView1: CardView? = null
    private var cardView2: CardView? = null
    private var cardView3: CardView? = null
    private var lottieAnimationView: LottieAnimationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtén referencias a las vistas desde el diseño XML
        cardView1 = findViewById(R.id.cardView1)
        cardView2 = findViewById<CardView>(R.id.cardView2)
        cardView3 = findViewById<CardView>(R.id.cardView3)
        lottieAnimationView = findViewById(R.id.lottieAnimationView)

        // Configura el OnClickListener para el CardView1 si deseas manejar clics en la tarjeta
        cardView1?.setOnClickListener {
            cardView1?.let {
                // Agrega el comportamiento que deseas cuando se hace clic en cardView1
            }
        }
// Configura el LottieAnimationView
        lottieAnimationView.apply {
            this!!.setAnimation("animation.json")
            playAnimation()
        }

    }
}







