package arellano.andre.thecheezery_arell.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import arellano.andre.thecheezery_arell.data.Product

@Composable
fun CartScreen(cart: List<Product>, total: Float, onRemoveClick: (Product) -> Unit, onBackClick: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        TextButton(onClick = onBackClick) { Text("← Back") }
        Text("My order", style = MaterialTheme.typography.headlineMedium)
        if (cart.isEmpty()) Text("Your cart is empty", Modifier.padding(24.dp))
        LazyColumn(Modifier.weight(1f)) { items(cart) { product ->
            Row(Modifier.fillMaxWidth().padding(vertical = 8.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(product.name, Modifier.weight(1f))
                Text("$" + product.price)
                TextButton(onClick = { onRemoveClick(product) }) { Text("Remove") }
            }
        } }
        Text("Total: $" + String.format(java.util.Locale.US, "%.2f", total), style = MaterialTheme.typography.headlineSmall)
    }
}
