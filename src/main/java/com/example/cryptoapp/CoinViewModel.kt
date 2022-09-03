package com.example.cryptoapp

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import com.example.cryptoapp.api.ApiFactory
import com.example.cryptoapp.database.AppDatabase
import com.example.cryptoapp.databinding.ActivityMainBinding
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class CoinViewModel(application: Application): AndroidViewModel(application) {

    private val db = AppDatabase.getInstance(application)
    private val compositeDisposable = CompositeDisposable()
    val priceList = db.coinPriceInfoDao().getPriceList()

    fun loadData(){
        val disposable = ApiFactory.apiService.getTopCoinsInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("LOADING_DATA_TEST", it.toString())
            }, {
                Log.d("LOADING_DATA_TEST", it.message.orEmpty())
            })
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }
}