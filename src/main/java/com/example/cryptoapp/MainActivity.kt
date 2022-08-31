package com.example.cryptoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.cryptoapp.api.ApiFactory
import com.example.cryptoapp.databinding.ActivityMainBinding
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val disposable = ApiFactory.apiService.getFullPriceList(fSyms = "BTC, ETH, TWT")
            .subscribeOn(Schedulers.io()) // запросы в интернет не на главном потоке
            .observeOn(Schedulers.computation()) // тут не как в коде
            .subscribe({
                       Log.d("LOADING_DATA_TEST", it.toString())
            }, {
                Log.d("LOADING_DATA_TEST", it.message.orEmpty())
            })
        compositeDisposable.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}