package com.example.firozhasan.retrofitkotlinexample.`interface`

interface CountryInterface {

    interface countryModel {
        fun getCountyNameByCapital(city: String)
        fun getCountry(): String
    }

    interface countryView {
        fun updateViewData()
        fun initView()
    }

    interface countryPresenter {
        fun networkcall(city: String)
        fun showCountry() : String
    }
}