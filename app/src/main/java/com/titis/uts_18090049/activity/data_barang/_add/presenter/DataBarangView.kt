package com.titis.uts_18090049.activity.data_barang.presenter

import com.titis.uts_18090049.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}