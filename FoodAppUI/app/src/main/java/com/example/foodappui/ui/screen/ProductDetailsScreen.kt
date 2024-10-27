package com.example.foodappui.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.foodappui.data.ProductFlavorData
import com.example.foodappui.data.ProductFlavorState
import com.example.foodappui.data.ProductNutritionState
import com.example.foodappui.data.ProductPreviewState
import com.example.foodappui.data.ProductionNutritionData
import com.example.foodappui.ui.screen.components.FlavorSection
import com.example.foodappui.ui.screen.components.ProductNutritionSection
import com.example.foodappui.ui.screen.components.ProductPreviewSection

@Composable
fun ProductDetailsScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorData,
    productNutritionState: ProductNutritionState = ProductionNutritionData
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(state = productPreviewState)
        Spacer(modifier = Modifier.height(16.dp))
        FlavorSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            data = productFlavors
        )
        Spacer(modifier = Modifier.height(16.dp))
        ProductNutritionSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            state = productNutritionState
        )
    }
}