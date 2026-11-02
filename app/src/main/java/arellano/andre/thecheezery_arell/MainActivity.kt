
package arellano.andre.thecheezery_arell

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import arellano.andre.thecheezery_arell.Navigation.AppNavigation
import arellano.andre.thecheezery_arell.ui.theme.TheCheezery_ArellTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TheCheezery_ArellTheme {
                AppNavigation()
            }
        }
    }
}
