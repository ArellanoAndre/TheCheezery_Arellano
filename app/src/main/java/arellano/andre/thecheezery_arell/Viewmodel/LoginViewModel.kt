package arellano.andre.thecheezery_arell.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set
    var error by mutableStateOf("")
        private set

    fun changeEmail(value: String) { email = value; error = "" }
    fun changePassword(value: String) { password = value; error = "" }

    fun login(): Boolean {
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email.trim()).matches()) {
            error = "Escribe un correo válido"
            return false
        }
        if (password.isBlank()) {
            error = "Escribe tu contraseña"
            return false
        }
        error = ""
        return true
    }
}
