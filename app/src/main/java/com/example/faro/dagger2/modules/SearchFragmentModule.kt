package com.example.faro.dagger2.modules

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.faro.ui.search.searchRecycleView.SearchRecyclerAdapter
import com.example.faro.view.BaseFragment
import dagger.Module
import dagger.Provides

@Module
class SearchFragmentModule {

    @Provides
    internal fun provideLinearLayoutManager(fragment: Fragment): LinearLayoutManager {
        return LinearLayoutManager(fragment.activity)
    }

    @Provides
    internal fun provideRecyclerAdapter() = SearchRecyclerAdapter()
}