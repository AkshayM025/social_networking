package com.socialnetworking.app.modules.discover.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentDiscoverBinding
import com.socialnetworking.app.modules.discover.`data`.model.DiscoverRowModel
import com.socialnetworking.app.modules.discover.`data`.viewmodel.DiscoverVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DiscoverFragment : BaseFragment<FragmentDiscoverBinding>(R.layout.fragment_discover) {
  private val viewModel: DiscoverVM by viewModels<DiscoverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val discoverAdapter = DiscoverAdapter(viewModel.discoverList.value?:mutableListOf())
    binding.recyclerDiscover.adapter = discoverAdapter
    discoverAdapter.setOnItemClickListener(
    object : DiscoverAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DiscoverRowModel) {
        onClickRecyclerDiscover(view, position, item)
      }
    }
    )
    viewModel.discoverList.observe(requireActivity()) {
      discoverAdapter.updateData(it)
    }
    binding.discoverVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDiscover(
    view: View,
    position: Int,
    item: DiscoverRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DISCOVER_FRAGMENT"

  }
}
