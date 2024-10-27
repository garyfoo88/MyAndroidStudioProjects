package com.example.foodappui.data

data class ProductNutritionState(
    val calories: Calories,
    val nutrition: List<Nutrition>
)

data class Calories(
    val value: String,
    val unit: String
)

data class Nutrition(
    val title: String,
    val amount: String,
    val unit: String
)

val ProductionNutritionData = ProductNutritionState(
    calories = Calories(
        value = "1000",
        unit = "Cal"
    ),
    nutrition = listOf(
        Nutrition(
            title = "Total Fat (45% DV)",
            amount = "35",
            unit = "g"
        ),
        Nutrition(
            title = "Total Carbs (16% DV)",
            amount = "43",
            unit = "g"
        ),
        Nutrition(
            title = "Protein",
            amount = "36",
            unit = "g"
        )
    )
)