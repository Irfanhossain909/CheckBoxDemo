package com.rootcode.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rootcode.checkboxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var msg = ""
            if (binding.checkbox1.isChecked){
                msg = "Playing is Checked"
            }
            if (binding.checkbox2.isChecked){
                msg = "Eating is Checked"
            }
            if (binding.checkbox3.isChecked){
                msg = "Sleeping is Checked"
            }
            if(binding.checkbox4.isChecked){
                msg = "Reading is Checked"
            }
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        }
    }
}