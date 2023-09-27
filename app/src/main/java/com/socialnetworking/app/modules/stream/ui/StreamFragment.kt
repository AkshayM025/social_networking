package com.socialnetworking.app.modules.stream.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseFragment
import com.socialnetworking.app.databinding.FragmentStreamBinding
import com.socialnetworking.app.modules.stream.`data`.model.StreamRowModel
import com.socialnetworking.app.modules.stream.`data`.viewmodel.StreamVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StreamFragment : BaseFragment<FragmentStreamBinding>(R.layout.fragment_stream) {
  private val viewModel: StreamVM by viewModels<StreamVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val streamAdapter = StreamAdapter(viewModel.streamList.value?:mutableListOf())
    binding.recyclerStream.adapter = streamAdapter
    streamAdapter.setOnItemClickListener(
    object : StreamAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StreamRowModel) {
        onClickRecyclerStream(view, position, item)
      }
    }
    )
    viewModel.streamList.observe(requireActivity()) {
      streamAdapter.updateData(it)
    }
    binding.streamVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerStream(
    view: View,
    position: Int,
    item: StreamRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STREAM_FRAGMENT"

  }
}
