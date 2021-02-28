package com.hsaliu.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    var number1 : Float = 0.0f
    var isPlus : Boolean = false
    var isMinus : Boolean =false
    var isDivision : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.number_edit_text)
    }

    fun operationFunction(view : View){


        when(view.id){
            R.id.button_one ->{
                numberClicked(1)
            }

            R.id.button_two ->{
                numberClicked(2)
            }

            R.id.button_three ->{
                numberClicked(3)
            }
            R.id.button_four ->{
                numberClicked(4)
            }
            R.id.button_five ->{
                numberClicked(5)
            }
            R.id.button_six ->{
                numberClicked(6)
            }
            R.id.button_seven ->{
                numberClicked(7)
            }
            R.id.button_eight ->{
                numberClicked(8)
            }
            R.id.button_nine ->{
                numberClicked(9)
            }
            R.id.button_zero ->{
                numberClicked(0)
            }
            R.id.button_decimal ->{
                val number = editText.text.toString() + "."
                editText.setText(number)
            }
            R.id.button_cancel ->{

                editText.setText("")
            }
            R.id.button_addition->{
                plusClicked()
            }
            R.id.button_subtract->{
                minusClicked()
            }
            R.id.button_divison->{
                divisonClicked()

            }
            R.id.button_equality->{
                equalIsClicked()

            }
        }
    }

    private fun numberClicked(number: Int){
        val number = editText.text.toString() + number.toString()
        editText.setText(number)
    }

    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus=true
    }

    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus=true
    }

    private fun divisonClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivision=true
    }

    private fun equalIsClicked(){
        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDivision -> {
                divide()
            }
        }
    }

    private fun plus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 + number2
        editText.setText(result.toString())
        isPlus = false
    }

    private fun minus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 - number2
        editText.setText(result.toString())
        isMinus=false
    }

    private fun divide(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 / number2
        editText.setText(result.toString())
        isDivision=false
    }
}