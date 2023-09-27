package com.socialnetworking.app.modules.messages.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentMessagesBinding
import com.socialnetworking.app.modules.messages.`data`.model.Listellipsefifteen1RowModel
import com.socialnetworking.app.modules.messages.`data`.model.ListsenderRowModel
import com.socialnetworking.app.modules.messages.`data`.viewmodel.MessagesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessagesFragment : BaseFragment<FragmentMessagesBinding>(R.layout.fragment_messages) {
  private val viewModel: MessagesVM by viewModels<MessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen1RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(requireActivity()) {
      listellipsefifteenAdapter.updateData(it)
    }
    val listsenderAdapter = ListsenderAdapter(viewModel.listsenderList.value?:mutableListOf())
    binding.recyclerListsender.adapter = listsenderAdapter
    listsenderAdapter.setOnItemClickListener(
    object : ListsenderAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsenderRowModel) {
        onClickRecyclerListsender(view, position, item)
      }
    }
    )
    viewModel.listsenderList.observe(requireActivity()) {
      listsenderAdapter.updateData(it)
    }
    binding.messagesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListsender(
    view: View,
    position: Int,
    item: ListsenderRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MESSAGES_FRAGMENT"


    fun getInstance(bundle: Bundle?): MessagesFragment {
      val fragment = MessagesFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
