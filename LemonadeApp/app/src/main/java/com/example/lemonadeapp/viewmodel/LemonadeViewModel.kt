package com.example.lemonadeapp.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


class LemonadeViewModel : ViewModel() {
    // Mutable state for the current step and squeeze count
    var currentStep by mutableStateOf(1)
        private set

    var squeezeCount by mutableStateOf(0)
        private set

    fun pickLemon() {
        currentStep = 2
        squeezeCount = (2..4).random()
    }

    fun squeezeLemon() {
        // Decrease the squeeze count by 1 for each click the user performs
        squeezeCount--
        // When we're done squeezing the lemon, move to the next step
        if (squeezeCount == 0) {
            currentStep = 3
        }
    }

    fun drinkLemonade() {
        currentStep = 4
    }

    // Function to reset the step
    fun reset() {
        currentStep = 1
    }
}