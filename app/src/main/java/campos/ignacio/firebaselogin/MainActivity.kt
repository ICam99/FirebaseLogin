package campos.ignacio.firebaselogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import campos.ignacio.firebaselogin.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Initialize Firebase Auth
        auth = Firebase.auth
    }
}