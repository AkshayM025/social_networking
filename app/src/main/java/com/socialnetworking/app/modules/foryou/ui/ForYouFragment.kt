package com.socialnetworking.app.modules.foryou.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentForYouBinding
import com.socialnetworking.app.modules.foryou.`data`.model.ForyouRowModel
import com.socialnetworking.app.modules.foryou.`data`.viewmodel.ForYouVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ForYouFragment : BaseFragment<FragmentForYouBinding>(R.layout.fragment_for_you) {
  private val viewModel: ForYouVM by viewModels<ForYouVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val foryouAdapter = ForyouAdapter(viewModel.foryouList.value?:mutableListOf())
    binding.recyclerForyou.adapter = foryouAdapter
    foryouAdapter.setOnItemClickListener(
    object : ForyouAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ForyouRowModel) {
        onClickRecyclerForyou(view, position, item)
      }
    }
    )
    viewModel.foryouList.observe(requireActivity()) {
      foryouAdapter.updateData(it)
    }
    binding.forYouVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerForyou(
    view: View,
    position: Int,
    item: ForyouRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOR_YOU_FRAGMENT"

  }
}
