package com.example.mad_practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
//        val countupButton: Button = findViewById(R.id.countup_id)
        rollButton.setOnClickListener { rollDice() }
//        countupButton.setOnClickListener { countup() }
        //        countupButton.setOnClickListener { countup() }
    }
    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

//    private fun rollDice() {
//        /*val val resultText: TextView = findViewById(R.id.result_text)*/
//        val randomInt = (1..6).random()
//        val randomInt2 = (1..6).random()
//        Toast.makeText(
//            this, "button clicked",
//            Toast.LENGTH_SHORT
//        ).show()
//        /*resultText.text = randomInt.toString()*/
//        // resultText.text = "Dice Rolled!"
//        val diceImage: ImageView = findViewById(R.id.dice_image)
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        diceImage.setImageResource(drawableResource)
//        diceImage2.setImageResource(drawableResource)
//    }

/*    private fun countup() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World") {
            resultText.text = "1"
        } else {

            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/
}
