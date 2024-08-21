package com.grpcx.androidtask.presentation.main

import androidx.lifecycle.ViewModel
import com.grpcx.androidtask.domain.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

}