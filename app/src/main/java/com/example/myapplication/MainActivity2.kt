package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

//appCompatActivity好向下相容,androidx is the trend
//Android jetpack
//gradle:
//build.gradle.kts implementation(libs.androidx.appcompat)
class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val secret = (1..10).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        //設定身上的畫面
        //R全名是com.example.myapplication.R
        //R類別是自動產生的
        //會自動掃描res資料夾下的更動,包含各種視覺呈現
//        setContentView(R.layout.activity_main)
        //像R.id.hello_view這樣就可以取得資源了
        //使用findViewById還要轉換
        //viewBinding使用layout,必須要去build.gradle.kts(Module :app)設定
        setContentView(binding.root)

        Toast.makeText(this, "secret: $secret", Toast.LENGTH_LONG).show()
        //約束值在activity_main.xml
        //ctrl+滑鼠左鍵決定元素位置
        //ctrl+B到元件原始碼


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun guess(view: View) {
        if (binding.number.text.toString() != "") {
            val num = binding.number.text.toString().toInt()
            Log.d("MainActivity2", num.toString())
            val message = if (num > secret) {
                //resources.getString()
                getString(R.string.smaller)
            } else if (num < secret) {
                getString(R.string.bigger)
            } else {
                getString(R.string.got_it)
            }

            AlertDialog.Builder(this)
                .setTitle(getString(R.string.info))
                .setMessage(message)
                .setPositiveButton(getString(R.string.ok), null)
                .show()
        } else {
            Toast.makeText(this, getString(R.string.please_enter_a_number), Toast.LENGTH_LONG)
                .show()
        }
//        val message = if
    }
}