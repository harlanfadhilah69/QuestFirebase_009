package com.example.questfirebasee_009.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.questfirebasee_009.modeldata.DetailSiswa
import com.example.questfirebasee_009.modeldata.UIStateSiswa
import com.example.questfirebasee_009.modeldata.toDataSiswa
import com.example.questfirebasee_009.repositori.RepositorySiswa

class EntryViewModel(private val repositorySiswa: RepositorySiswa) : ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

