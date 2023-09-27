package com.socialnetworking.app.modules.dailynew.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentDailyNewBinding
import com.socialnetworking.app.modules.dailynew.`data`.model.ListfiveRowModel
import com.socialnetworking.app.modules.dailynew.`data`.model.ListnineteenRowModel
import com.socialnetworking.app.modules.dailynew.`data`.viewmodel.DailyNewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyNewFragment : BaseFragment<FragmentDailyNewBinding>(R.layout.fragment_daily_new) {
  private val viewModel: DailyNewVM by viewModels<DailyNewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listnineteenAdapter =
    ListnineteenAdapter(viewModel.listnineteenList.value?:mutableListOf())
    binding.recyclerListnineteen.adapter = listnineteenAdapter
    listnineteenAdapter.setOnItemClickListener(
    object : ListnineteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnineteenRowModel) {
        onClickRecyclerListnineteen(view, position, item)
      }
    }
    )
    viewModel.listnineteenList.observe(requireActivity()) {
      listnineteenAdapter.updateData(it)
    }
    val listfiveAdapter = ListfiveAdapter(viewModel.listfiveList.value?:mutableListOf())
    binding.recyclerListfive.adapter = listfiveAdapter
    listfiveAdapter.setOnItemClickListener(
    object : ListfiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfiveRowModel) {
        onClickRecyclerListfive(view, position, item)
      }
    }
    )
    viewModel.listfiveList.observe(requireActivity()) {
      listfiveAdapter.updateData(it)
    }
    binding.dailyNewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnineteen(
    view: View,
    position: Int,
    item: ListnineteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListfive(
    view: View,
    position: Int,
    item: ListfiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAILY_NEW_FRAGMENT"

  }
}
