package com.example.cryptoapp.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class CoinPriceInfo (
    @SerializedName("TYPE")
    @Expose
    private val type: String? = null,


    @SerializedName("MARKET")
    @Expose
    private val market: String? = null,


    @SerializedName("FROMSYMBOL")
    @Expose
    private val fromsymbol: String? = null,


    @SerializedName("TOSYMBOL")
    @Expose
    private val tosymbol: String? = null,


    @SerializedName("FLAGS")
    @Expose
    private val flags: String? = null,


    @SerializedName("PRICE")
    @Expose
    private val price: String? = null,


    @SerializedName("LASTUPDATE")
    @Expose
    private val lastUpdate: Long? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    private val lastVolume: String? = null,


    @SerializedName("LASTVOLUMETO")
    @Expose
    private val lastVolumeTo: String? = null,


    @SerializedName("LASTTRADEID")
    @Expose
    private val lastTradeId: String? = null,


    @SerializedName("VOLUMEDAY")
    @Expose
    private val volumeDay: String? = null,


    @SerializedName("VOLUMEDAYTO")
    @Expose
    private val volumeDayTo: String? = null,


    @SerializedName("VOLUME24HOUR")
    @Expose
    private val volume24Hour: String? = null,


    @SerializedName("VOLUME24HOURTO")
    @Expose
    private val volume24HourTo: String? = null,


    @SerializedName("OPENDAY")
    @Expose
    private val openDay: String? = null,


    @SerializedName("HIGHDAY")
    @Expose
    private val highDay: String? = null,


    @SerializedName("LOWDAY")
    @Expose
    private val lowDay: String? = null,


    @SerializedName("OPEN24HOUR")
    @Expose
    private val open24Hour: String? = null,


    @SerializedName("HIGH24HOUR")
    @Expose
    private val high24Hour: String? = null,


    @SerializedName("LOW24HOUR")
    @Expose
    private val low24Hour: String? = null,


    @SerializedName("LASTMARKET")
    @Expose
    private val lastMarket: String? = null,


    @SerializedName("VOLUMEHOUR")
    @Expose
    private val volumeHour: String? = null,


    @SerializedName("VOLUMEHOURTO")
    @Expose
    private val volumeHourTo: String? = null,


    @SerializedName("OPENHOUR")
    @Expose
    private val openHour: String? = null,


    @SerializedName("HIGHHOUR")
    @Expose
    private val highHour: String? = null,


    @SerializedName("LOWHOUR")
    @Expose
    private val lowHour: String? = null,


    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private val topTierVolume24Hour: String? = null,


    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private val topTierVolume24HourTo: String? = null,


    @SerializedName("CHANGE24HOUR")
    @Expose
    private val change24Hour: String? = null,


    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private val changePCT24Hour: String? = null,


    @SerializedName("CHANGEDAY")
    @Expose
    private val changeday: String? = null,


    @SerializedName("CHANGEPCTDAY")
    @Expose
    private val changePCTday: String? = null,


    @SerializedName("SUPPLY")
    @Expose
    private val supply: Int? = null,


    @SerializedName("MKTCAP")
    @Expose
    private val mktCap: String? = null,


    @SerializedName("TOTALVOLUME24H")
    @Expose
    private val totalVolume24Hour: String? = null,


    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private val totalVolume24HourTo: String? = null,


    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private val totalTopTierVolume24Hour: String? = null,


    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private val totalTopTierVolume24HourTo: String? = null,


    @SerializedName("IMAGEURL")
    @Expose
    private val imageUrl: String? = null


)