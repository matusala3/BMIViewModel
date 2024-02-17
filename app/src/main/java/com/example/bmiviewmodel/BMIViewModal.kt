package com.example.bmiviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class BMIViewModal: ViewModel(){
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    var bmi: Float = 0f
        get(){
            val height = heightInput.toFloatOrNull() ?: 0f
            val weight = weightInput.toFloatOrNull() ?: 0f
            return if (height > 0 && weight > 0) weight / (height / 100).pow(2) else 0f
        }
    fun changeHeightInput(value: String){
        heightInput = value
    }
    fun changeWeightInput(value: String){
        weightInput = value
    }

}