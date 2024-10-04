package com.example.kotlinbankappui.data

import androidx.compose.ui.graphics.Brush

data class Cards(
    val cardType: String,
    val cardNumber: String,
    val cardName: String,
    val balance: Double,
    val color: Brush

)
