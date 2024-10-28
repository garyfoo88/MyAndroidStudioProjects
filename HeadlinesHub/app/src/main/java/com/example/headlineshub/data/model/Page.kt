package com.example.headlineshub.data.model

import androidx.annotation.DrawableRes
import com.example.headlineshub.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val img: Int
)

val pages = listOf(
    Page(
        title = "Title 1 onboarding",
        description = "Description 1 for onboarding",
        img = R.drawable.onboarding1
    ),
    Page(
        title = "Title 2 onboarding",
        description = "Description 2 for onboarding",
        img = R.drawable.onboarding2
    ),
    Page(
        title = "Title 3 onboarding",
        description = "Description 3 for onboarding",
        img = R.drawable.onboarding3
    )
)