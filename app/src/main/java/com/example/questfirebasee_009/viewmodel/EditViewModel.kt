package com.example.questfirebasee_009.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase_009.view.route.DestinasiDetail
import com.example.questfirebasee_009.modeldata.DetailSiswa
import com.example.questfirebasee_009.modeldata.UIStateSiswa
import com.example.questfirebasee_009.modeldata.toDataSiswa
import com.example.questfirebasee_009.modeldata.toUiStateSiswa
import com.example.questfirebasee_009.repositori.RepositorySiswa
import kotlinx.coroutines.launch

class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositorySiswa: RepositorySiswa
) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private val idSiswa: Long =
        savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong()
            ?: error("idSiswa tidak ditemukan di SavedStateHandle")

    init {
        viewModelScope.launch {
            uiStateSiswa = repositorySiswa.getSatuSiswa(idSiswa)!!
                .toUiStateSiswa(true)
        }
    }

