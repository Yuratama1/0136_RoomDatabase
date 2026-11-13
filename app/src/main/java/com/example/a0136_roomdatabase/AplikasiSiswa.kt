package com.example.a0136_roomdatabase

import android.app.Application
import com.example.a0136_roomdatabase.repositori.AppContainer
import com.example.a0136_roomdatabase.repositori.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()

        container = ContainerDataApp(this)
    }
}