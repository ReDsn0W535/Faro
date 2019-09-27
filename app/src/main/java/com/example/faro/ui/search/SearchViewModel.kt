package com.example.faro.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.faro.data.local.db.RecyclerComponentsHelper
import com.example.faro.ui.base.BaseViewModel
import com.example.faro.ui.search.searchRecycleView.SearchMenuItemViewModel

class SearchViewModel : BaseViewModel<SearchNavigator>(){
    private var searchItemsViewData : MutableLiveData<ArrayList<SearchMenuItemViewModel>>
    init {
        searchItemsViewData = MutableLiveData()
        setData(ArrayList(RecyclerComponentsHelper.getSearchComponents()))  // must take values from server

    }

    fun getOpenSourceItemsLiveData(): LiveData<ArrayList<SearchMenuItemViewModel>> {
        return searchItemsViewData
    }

    fun setData(items : ArrayList<SearchMenuItemViewModel>){
        searchItemsViewData.value = items
    }
}
