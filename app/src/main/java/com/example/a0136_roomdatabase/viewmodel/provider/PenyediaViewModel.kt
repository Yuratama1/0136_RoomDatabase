package com.example.a0136_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a0136_roomdatabase.AplikasiSiswa

object PenyediaViewModel {

    val Factory = viewModelFactory {

        initializer {
            _root_ide_package_.com.example.a0136_roomdatabase.viewmodel.HomeViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            _root_ide_package_.com.example.a0136_roomdatabase.viewmodel.EntryViewModel(
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            _root_ide_package_.com.example.a0136_roomdatabase.viewmodel.DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }

        initializer {
            _root_ide_package_.com.example.a0136_roomdatabase.viewmodel.EditViewModel(
                this.createSavedStateHandle(),
                aplikasiSiswa().container.repositoriSiswa
            )
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
            as AplikasiSiswa)