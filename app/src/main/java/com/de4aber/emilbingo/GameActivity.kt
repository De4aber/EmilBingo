package com.de4aber.emilbingo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
//Den bliver ikke brugt længere
class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        window.decorView.apply {systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) }
        var list = listOf("Dyb stemme","Pive stemme","2 Hænder foran øjne","1 Hånd foran øjne","2 Hænder i hår","1 Hånd i hår","Tomat ansigt","Siger noget dumt","\"Jeg smelter\"","\"Nej men prøv lige at hør\"","Misser i beer pong","Ironien faktisk er på plads","Laver en reel god joke","Lyver i Meyer","Rammer i beer pong","Tager et shot","Drikker 1 øl","\"Økosystem\"","Flirter med en pige","Snakker for at undgå stilhed","\"Du nedern\"","\"Du pinlig\"","\"Det ironi\"","Laver en \"Joke\"").toMutableList()

        var grid = findViewById<GridLayout>(R.id.test)
        var b1 = findViewById<Button>(R.id.tile1)
        var b2 = findViewById<Button>(R.id.tile2)
        var b3 = findViewById<Button>(R.id.tile3)
        var b4 = findViewById<Button>(R.id.tile4)
        var b5 = findViewById<Button>(R.id.tile5)
        var b6 = findViewById<Button>(R.id.tile6)
        var b7 = findViewById<Button>(R.id.tile7)
        var b8 = findViewById<Button>(R.id.tile8)
        var b9 = findViewById<Button>(R.id.tile9)
        var b10 = findViewById<Button>(R.id.tile10)
        var b11 = findViewById<Button>(R.id.tile11)
        var b12 = findViewById<Button>(R.id.tile12)
        var b13 = findViewById<Button>(R.id.tile13)
        var b14 = findViewById<Button>(R.id.tile14)
        var b15 = findViewById<Button>(R.id.tile15)
        var b16 = findViewById<Button>(R.id.tile16)
        var b17 = findViewById<Button>(R.id.tile17)
        var b18 = findViewById<Button>(R.id.tile18)
        var b19 = findViewById<Button>(R.id.tile19)
        var b20 = findViewById<Button>(R.id.tile20)
        var b21 = findViewById<Button>(R.id.tile21)
        var b22 = findViewById<Button>(R.id.tile22)
        var b23 = findViewById<Button>(R.id.tile23)
        var b24 = findViewById<Button>(R.id.tile24)
        var gratis = findViewById<Button>(R.id.gratis)
        var luk = findViewById<Button>(R.id.luk)

        var b1Clicked = false
        var b2Clicked = false
        var b3Clicked = false
        var b4Clicked = false
        var b5Clicked = false
        var b6Clicked = false
        var b7Clicked = false
        var b8Clicked = false
        var b9Clicked = false
        var b10Clicked = false
        var b11Clicked = false
        var b12Clicked = false
        var b13Clicked = false
        var b14Clicked = false
        var b15Clicked = false
        var b16Clicked = false
        var b17Clicked = false
        var b18Clicked = false
        var b19Clicked = false
        var b20Clicked = false
        var b21Clicked = false
        var b22Clicked = false
        var b23Clicked = false
        var b24Clicked = false
        var gratisClicked = false

        b1.text = getRandomElement(list)
        b2.text = getRandomElement(list)
        b3.text = getRandomElement(list)
        b4.text = getRandomElement(list)
        b5.text = getRandomElement(list)
        b6.text = getRandomElement(list)
        b7.text = getRandomElement(list)
        b8.text = getRandomElement(list)
        b9.text = getRandomElement(list)
        b10.text = getRandomElement(list)
        b11.text = getRandomElement(list)
        b12.text = getRandomElement(list)
        b13.text = getRandomElement(list)
        b14.text = getRandomElement(list)
        b15.text = getRandomElement(list)
        b16.text = getRandomElement(list)
        b17.text = getRandomElement(list)
        b18.text = getRandomElement(list)
        b19.text = getRandomElement(list)
        b20.text = getRandomElement(list)
        b21.text = getRandomElement(list)
        b22.text = getRandomElement(list)
        b23.text = getRandomElement(list)
        b24.text = getRandomElement(list)


        b1.setOnClickListener(View.OnClickListener { b1Clicked = !b1Clicked; if (b1Clicked) { b1.setBackgroundResource(R.drawable.selected) } else{ b1.setBackgroundResource(R.drawable.tilestyle) } })
        b2.setOnClickListener(View.OnClickListener { b2Clicked = !b2Clicked; if (b2Clicked) { b2.setBackgroundResource(R.drawable.selected) } else{ b2.setBackgroundResource(R.drawable.tilestyle) } })
        b3.setOnClickListener(View.OnClickListener { b3Clicked = !b3Clicked; if (b3Clicked) { b3.setBackgroundResource(R.drawable.selected) } else{ b3.setBackgroundResource(R.drawable.tilestyle) } })
        b4.setOnClickListener(View.OnClickListener { b4Clicked = !b4Clicked; if (b4Clicked) { b4.setBackgroundResource(R.drawable.selected) } else{ b4.setBackgroundResource(R.drawable.tilestyle) } })
        b5.setOnClickListener(View.OnClickListener { b5Clicked = !b5Clicked; if (b5Clicked) { b5.setBackgroundResource(R.drawable.selected) } else{ b5.setBackgroundResource(R.drawable.tilestyle) } })
        b6.setOnClickListener(View.OnClickListener { b6Clicked = !b6Clicked; if (b6Clicked) { b6.setBackgroundResource(R.drawable.selected) } else{ b6.setBackgroundResource(R.drawable.tilestyle) } })
        b7.setOnClickListener(View.OnClickListener { b7Clicked = !b7Clicked; if (b7Clicked) { b7.setBackgroundResource(R.drawable.selected) } else{ b7.setBackgroundResource(R.drawable.tilestyle) } })
        b8.setOnClickListener(View.OnClickListener { b8Clicked = !b8Clicked; if (b8Clicked) { b8.setBackgroundResource(R.drawable.selected) } else{ b8.setBackgroundResource(R.drawable.tilestyle) } })
        b9.setOnClickListener(View.OnClickListener { b9Clicked = !b9Clicked; if (b9Clicked) { b9.setBackgroundResource(R.drawable.selected) } else{ b9.setBackgroundResource(R.drawable.tilestyle) } })
        b10.setOnClickListener(View.OnClickListener { b10Clicked = !b10Clicked; if (b10Clicked) { b10.setBackgroundResource(R.drawable.selected) } else{ b10.setBackgroundResource(R.drawable.tilestyle) } })
        b11.setOnClickListener(View.OnClickListener { b11Clicked = !b11Clicked; if (b11Clicked) { b11.setBackgroundResource(R.drawable.selected) } else{ b11.setBackgroundResource(R.drawable.tilestyle) } })
        b12.setOnClickListener(View.OnClickListener { b12Clicked = !b12Clicked; if (b12Clicked) { b12.setBackgroundResource(R.drawable.selected) } else{ b12.setBackgroundResource(R.drawable.tilestyle) } })
        b13.setOnClickListener(View.OnClickListener { b13Clicked = !b13Clicked; if (b13Clicked) { b13.setBackgroundResource(R.drawable.selected) } else{ b13.setBackgroundResource(R.drawable.tilestyle) } })
        b14.setOnClickListener(View.OnClickListener { b14Clicked = !b14Clicked; if (b14Clicked) { b14.setBackgroundResource(R.drawable.selected) } else{ b14.setBackgroundResource(R.drawable.tilestyle) } })
        b15.setOnClickListener(View.OnClickListener { b15Clicked = !b15Clicked; if (b15Clicked) { b15.setBackgroundResource(R.drawable.selected) } else{ b15.setBackgroundResource(R.drawable.tilestyle) } })
        b16.setOnClickListener(View.OnClickListener { b16Clicked = !b16Clicked; if (b16Clicked) { b16.setBackgroundResource(R.drawable.selected) } else{ b16.setBackgroundResource(R.drawable.tilestyle) } })
        b17.setOnClickListener(View.OnClickListener { b17Clicked = !b17Clicked; if (b17Clicked) { b17.setBackgroundResource(R.drawable.selected) } else{ b17.setBackgroundResource(R.drawable.tilestyle) } })
        b18.setOnClickListener(View.OnClickListener { b18Clicked = !b18Clicked; if (b18Clicked) { b18.setBackgroundResource(R.drawable.selected) } else{ b18.setBackgroundResource(R.drawable.tilestyle) } })
        b19.setOnClickListener(View.OnClickListener { b19Clicked = !b19Clicked; if (b19Clicked) { b19.setBackgroundResource(R.drawable.selected) } else{ b19.setBackgroundResource(R.drawable.tilestyle) } })
        b20.setOnClickListener(View.OnClickListener { b20Clicked = !b20Clicked; if (b20Clicked) { b20.setBackgroundResource(R.drawable.selected) } else{ b20.setBackgroundResource(R.drawable.tilestyle) } })
        b21.setOnClickListener(View.OnClickListener { b21Clicked = !b21Clicked; if (b21Clicked) { b21.setBackgroundResource(R.drawable.selected) } else{ b21.setBackgroundResource(R.drawable.tilestyle) } })
        b22.setOnClickListener(View.OnClickListener { b22Clicked = !b22Clicked; if (b22Clicked) { b22.setBackgroundResource(R.drawable.selected) } else{ b22.setBackgroundResource(R.drawable.tilestyle) } })
        b23.setOnClickListener(View.OnClickListener { b23Clicked = !b23Clicked; if (b23Clicked) { b23.setBackgroundResource(R.drawable.selected) } else{ b23.setBackgroundResource(R.drawable.tilestyle) } })
        b24.setOnClickListener(View.OnClickListener { b24Clicked = !b24Clicked; if (b24Clicked) { b24.setBackgroundResource(R.drawable.selected) } else{ b24.setBackgroundResource(R.drawable.tilestyle) } })
        gratis.setOnClickListener(View.OnClickListener { gratisClicked = !gratisClicked; if (gratisClicked) { gratis.setBackgroundResource(R.drawable.selected) } else{ gratis.setBackgroundResource(R.drawable.tilestyle) } })
        luk.setOnClickListener { finish() }

    }

    fun <T> getRandomElement(list: MutableList<T>): T {
        val randomIndex = Random.nextInt(list.size)

        val result = list[randomIndex]
        list.removeAt(randomIndex)
        return result
    }


}