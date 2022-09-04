package com.example.cryptoapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cryptoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CoinViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        /*viewModel.priceList.observe(this, Observer {
            Log.d("LOADING_DATA_TEST", "MainActivity, Success: $it")
        })*/

        viewModel.getDetailInfo("BTC").observe(this, Observer {
            Log.d("LOADING_DATA_TEST", "MainActivity, Success: $it")
        })
    }
}