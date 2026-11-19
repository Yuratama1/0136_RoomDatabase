package com.example.a0136_roomdatabase.viewmodel

class DetailViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa
) : ViewModel() {
    private val idSiswa: Int =
        checkNotNull(
            savedStateHandle[DestinasiDetailSiswa.itemIdarg]
        )
}