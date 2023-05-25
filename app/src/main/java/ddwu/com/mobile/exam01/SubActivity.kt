package ddwu.com.mobile.exam01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ddwu.com.mobile.exam01.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    lateinit var subBinding : ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        subBinding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(subBinding.root)
    }
}