package com.example.faro

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.faro.ui.main.MainViewModel
import com.example.faro.ui.search.SearchFragmentViewModel

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by jyotidubey on 22/02/19.
 */
@Singleton
class ViewModelProviderFactory @Inject constructor(): ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {

            return MainViewModel(/*dataManager, schedulerProvider*/) as T
        } else if (modelClass.isAssignableFrom(SearchFragmentViewModel::class.java))
            return SearchFragmentViewModel() as T
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}