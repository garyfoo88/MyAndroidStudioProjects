package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val img: Int
)

val ProductFlavorData = listOf(
    ProductFlavorState(
        name = "Cheese!",
        price = "$1.00",
        img = R.drawable.img_cheese
    ),
    ProductFlavorState(
        name = "Pig Meat!",
        price = "$0.50",
        img = R.drawable.img_bacon
    ),
    ProductFlavorState(
        name = "Tears-table",
        price = "$10.00",
        img = R.drawable.img_onion
    )
)