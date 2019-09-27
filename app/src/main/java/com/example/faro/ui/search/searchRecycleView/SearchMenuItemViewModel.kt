package com.example.faro.ui.search.searchRecycleView

import androidx.databinding.ObservableField
import com.example.faro.ui.search.searchRecycleView.subMenu.SubMenu

class SearchMenuItemViewModel(title: String, items: Array<SubMenu>) {
    var title = ObservableField<String>()

    var items = ObservableField<Array<SubMenu>>()

    init {
        this.items.set(items)
        this.title.set(title)
    }

}