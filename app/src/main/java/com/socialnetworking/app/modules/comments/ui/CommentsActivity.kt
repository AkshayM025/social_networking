package com.socialnetworking.app.modules.comments.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityCommentsBinding
import com.socialnetworking.app.modules.comments.`data`.model.CommentsRowModel
import com.socialnetworking.app.modules.comments.`data`.viewmodel.CommentsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CommentsActivity : BaseActivity<ActivityCommentsBinding>(R.layout.activity_comments) {
  private val viewModel: CommentsVM by viewModels<CommentsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val commentsAdapter = CommentsAdapter(viewModel.commentsList.value?:mutableListOf())
    binding.recyclerComments.adapter = commentsAdapter
    commentsAdapter.setOnItemClickListener(
    object : CommentsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CommentsRowModel) {
        onClickRecyclerComments(view, position, item)
      }
    }
    )
    viewModel.commentsList.observe(this) {
      commentsAdapter.updateData(it)
    }
    binding.commentsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerComments(
    view: View,
    position: Int,
    item: CommentsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMMENTS_ACTIVITY"

  }
}
