package com.socialnetworking.app.modules.trendingtabcontainer.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentTrendingTabContainerBinding
import com.socialnetworking.app.modules.search.ui.SearchActivity
import com.socialnetworking.app.modules.trendingtabcontainer.`data`.model.ListellipsefifteenRowModel
import com.socialnetworking.app.modules.trendingtabcontainer.`data`.viewmodel.TrendingTabContainerVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingTabContainerFragment :
    BaseFragment<FragmentTrendingTabContainerBinding>(R.layout.fragment_trending_tab_container) {
  private val viewModel: TrendingTabContainerVM by viewModels<TrendingTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsefifteenRowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(requireActivity()) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.trendingTabContainerVM = viewModel
    val adapter = TrendingTabContainerFragmentPagerAdapter(childFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame9031,binding.viewPagerTabbarview) { tab, position ->
      tab.text = TrendingTabContainerFragmentPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.searchViewGroup9021.setOnClickListener {
        val destIntent = SearchActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }

    fun onClickRecyclerListellipsefifteen(
      view: View,
      position: Int,
      item: ListellipsefifteenRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "TRENDING_TAB_CONTAINER_FRAGMENT"


      fun getInstance(bundle: Bundle?): TrendingTabContainerFragment {
        val fragment = TrendingTabContainerFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
