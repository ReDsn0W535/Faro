package com.example.faro.utils

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.faro.ui.search.SearchMenuItemViewModel

public final class BindingUtils private constructor(){

    @BindingAdapter("adapter")
    fun addSearchItems(recyclerView: RecyclerView, values : List<SearchMenuItemViewModel>){

    }
}