package arellano.andre.thecheezery_arell.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import arellano.andre.thecheezery_arell.data.Product

@Composable
fun ProductItem(product: Product, inCart: Boolean, onAddClick: (Product) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(painterResource(product.image), product.name, Modifier.size(76.dp).clip(CircleShape), contentScale = ContentScale.Crop)
        Spacer(Modifier.width(12.dp))
        Column(Modifier.weight(1f)) {
            Text(product.name, style = MaterialTheme.typography.titleMedium)
            product.description?.let { Text(it, style = MaterialTheme.typography.bodySmall, maxLines = 3) }
            Text("$" + product.price, style = MaterialTheme.typography.labelLarge)
        }
        Button(onClick = { onAddClick(product) }, enabled = !inCart) { Text(if (inCart) "✓" else "+") }
    }
}
