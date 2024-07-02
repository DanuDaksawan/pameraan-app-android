import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.intentandactivity.LoginActivity
import com.example.intentandactivity.MainActivity
import com.example.intentandactivity.R


class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etNoTelp: EditText
    private lateinit var etUsername: EditText
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var textLogin: TextView
    private val REGISTER_URL = "http://YOUR_SERVER_ADDRESS/api/register.php"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Inisialisasi komponen
        initComponents()

        // Menetapkan listener
        btnRegister.setOnClickListener(this)
        textLogin.setOnClickListener(this)
    }

    private fun initComponents() {
        etNoTelp = findViewById(R.id.editTextnotelp)
        etUsername = findViewById(R.id.editTextusername)
        etEmail = findViewById(R.id.editTextemail)
        etPassword = findViewById(R.id.editTextpassword)
        btnRegister = findViewById(R.id.btnregister)
        textLogin = findViewById(R.id.login)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnregister -> registerUser()
            R.id.login -> {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun registerUser() {
        val noTelp = etNoTelp.text.toString().trim()
        val username = etUsername.text.toString().trim()
        val email = etEmail.text.toString().trim()
        val password = etPassword.text.toString().trim()

        val stringRequest = object : StringRequest(Request.Method.POST, REGISTER_URL,
            Response.Listener { response ->
                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            },
            Response.ErrorListener { error ->
                Toast.makeText(this, "Registration failed: " + error.message, Toast.LENGTH_SHORT).show()
            }) {
            override fun getParams(): Map<String, String> {
                val params = HashMap<String, String>()
                params["no_telp"] = noTelp
                params["username"] = username
                params["email"] = email
                params["password"] = password
                return params
            }
        }

        val requestQueue = Volley.newRequestQueue(this)
        requestQueue.add(stringRequest)
    }
}
