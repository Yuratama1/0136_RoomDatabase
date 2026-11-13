package com.example.a0136_roomdatabase.repositori

import android.content.Context
import com.example.a0136_roomdatabase.room.DatabaseSiswa

interface AppContainer {
    val repositoriSiswa: RepositoriSiswa
}

class ContainerDataApp(
    private val context: Context
) : AppContainer {

    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(
            DatabaseSiswa.getDatabase(context).siswaDao()
        )
    }
}