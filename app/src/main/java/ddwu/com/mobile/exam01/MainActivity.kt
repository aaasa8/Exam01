package ddwu.com.mobile.exam01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ddwu.com.mobile.exam01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

    }
}