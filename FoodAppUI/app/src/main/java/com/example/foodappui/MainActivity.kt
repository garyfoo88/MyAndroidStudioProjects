package com.example.foodappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import com.example.foodappui.ui.screen.ProductDetailsScreen
import com.example.foodappui.ui.theme.AppTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.foodappui.data.OrderState

private const val PRODUCT_PRICE_PER_UNIT = 100.00
private const val PRODUCT_CURRENCY = "$"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                var amount by remember { mutableIntStateOf(1) }
                val totalPrice by remember { derivedStateOf { amount * PRODUCT_PRICE_PER_UNIT } }
                ProductDetailsScreen(
                    orderState = OrderState(
                        amount = amount,
                        totalPrice = "$PRODUCT_CURRENCY${totalPrice}"
                    ),
                    onAddItemClicked = { amount = amount.inc() },
                    onRemoveItemClicked = { if (amount > 0) amount = amount.dec() }
                )
            }
        }
    }
}