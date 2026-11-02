package arellano.andre.thecheezery_arell.data
import arellano.andre.thecheezery_arell.R

data class Product(val name: String = "",
                   val price: Float = 0F,
                   val image: Int,
                   val description: String? = null
)