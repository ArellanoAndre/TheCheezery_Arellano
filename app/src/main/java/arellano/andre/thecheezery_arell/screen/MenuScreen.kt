package arellano.andre.thecheezery_arell.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import arellano.andre.thecheezery_arell.R
import arellano.andre.thecheezery_arell.data.Category

@Composable
fun MenuScreen(
    onCategoryClick: (Category) -> Unit,
    onCartClick: () -> Unit
) {
    val gradient = Brush.verticalGradient(
        listOf(Color(0xFFEF029D), Color(0xFF97397D))
    )

    Column(
        modifier = Modifier.fillMaxSize().padding(top = 48.dp, start = 16.dp, end = 16.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = onCartClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFB2108D)
                )
            ) {
                Text("🛒")
            }
        }

        Spacer(Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.grupo2),
            contentDescription = "The Cheezery",
            modifier = Modifier.fillMaxWidth().height(170.dp)
        )

        Spacer(Modifier.height(20.dp))

        val categories = Category.entries

        Row(
            modifier = Modifier.fillMaxWidth().height(180.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f).fillMaxHeight().background(gradient),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                categories.filterIndexed { index, _ -> index % 2 == 0 }
                    .forEach { category ->
                        TextButton(onClick = { onCategoryClick(category) }) {
                            Text(
                                category.title,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                Text("Combos", color = Color.White)
            }

            Column(
                modifier = Modifier.weight(1f).fillMaxHeight().background(gradient),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                categories.filterIndexed { index, _ -> index % 2 == 1 }
                    .forEach { category ->
                        TextButton(onClick = { onCategoryClick(category) }) {
                            Text(
                                category.title,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                Text("Add new product", color = Color.White)
            }
        }
    }
}

