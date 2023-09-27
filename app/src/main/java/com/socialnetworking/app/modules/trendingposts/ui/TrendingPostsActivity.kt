package com.socialnetworking.app.modules.trendingposts.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.appcomponents.views.ImagePickerFragmentDialog
import com.socialnetworking.app.databinding.ActivityTrendingPostsBinding
import com.socialnetworking.app.modules.dailynewtabcontainer.ui.DailyNewTabContainerActivity
import com.socialnetworking.app.modules.search.ui.SearchActivity
import com.socialnetworking.app.modules.trendingposts.`data`.model.TrendingpostsRowModel
import com.socialnetworking.app.modules.trendingposts.`data`.viewmodel.TrendingPostsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingPostsActivity :
    BaseActivity<ActivityTrendingPostsBinding>(R.layout.activity_trending_posts) {
  private val viewModel: TrendingPostsVM by viewModels<TrendingPostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val trendingpostsAdapter =
    TrendingpostsAdapter(viewModel.trendingpostsList.value?:mutableListOf())
    binding.recyclerTrendingposts.adapter = trendingpostsAdapter
    trendingpostsAdapter.setOnItemClickListener(
    object : TrendingpostsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TrendingpostsRowModel) {
        onClickRecyclerTrendingposts(view, position, item)
      }
    }
    )
    viewModel.trendingpostsList.observe(this) {
      trendingpostsAdapter.updateData(it)
    }
    binding.trendingPostsVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.txtDailyNew.setOnClickListener {
      val destIntent = DailyNewTabContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.searchViewGroup9088.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerTrendingposts(
    view: View,
    position: Int,
    item: TrendingpostsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRENDING_POSTS_ACTIVITY"

  }
}
