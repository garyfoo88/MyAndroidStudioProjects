package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType
)

enum class ProductHighlightType {
    PRIMARY, SECONDARY
}

data class ProductPreviewState(
    val headline: String = "Mr. Burger",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Hot Seller!",
            type = ProductHighlightType.PRIMARY
        ),
        ProductHighlightState(
            text = "Unknown flavour",
            type = ProductHighlightType.SECONDARY
        )
    )
)