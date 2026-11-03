package arellano.andre.thecheezery_arell.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.derivedStateOf
import androidx.lifecycle.ViewModel
import arellano.andre.thecheezery_arell.data.Category
import arellano.andre.thecheezery_arell.data.Product
import arellano.andre.thecheezery_arell.data.catalog

class ShopViewModel : ViewModel() {
    private val _cart = mutableStateListOf<Product>()
    val cart: List<Product> get() = _cart
    val total: Float by derivedStateOf { _cart.sumOf { it.price.toDouble() }.toFloat() }

    fun productsOf(category: Category): List<Product> = catalog[category].orEmpty()
    fun isInCart(product: Product): Boolean = product in _cart
    fun addToCart(product: Product) { if (product !in _cart) _cart.add(product) }
    fun removeFromCart(product: Product) { _cart.remove(product) }
}
