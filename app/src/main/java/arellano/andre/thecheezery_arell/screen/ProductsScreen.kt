package arellano.andre.thecheezery_arell.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import arellano.andre.thecheezery_arell.data.Product
import arellano.andre.thecheezery_arell.Components.ProductItem

@Composable
fun ProductsScreen(title: String, products: List<Product>, isInCart: (Product) -> Boolean,
                   onAddClick: (Product) -> Unit, onBackClick: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        TextButton(onClick = onBackClick) { Text("← Back") }
        Text(title, style = MaterialTheme.typography.headlineMedium)
        LazyColumn { items(products) { product ->
            ProductItem(product, isInCart(product), onAddClick)
        } }
    }
}
