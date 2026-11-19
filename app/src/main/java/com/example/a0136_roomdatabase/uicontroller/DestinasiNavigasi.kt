package com.example.a0136_roomdatabase.uicontroller

import androidx.annotation.StringRes

interface DestinasiNavigasi {

    val route: String

    @get:StringRes
    val titleRes: Int
}