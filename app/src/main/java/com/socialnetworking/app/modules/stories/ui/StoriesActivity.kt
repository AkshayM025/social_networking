package com.socialnetworking.app.modules.stories.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivityStoriesBinding
import com.socialnetworking.app.modules.search.ui.SearchActivity
import com.socialnetworking.app.modules.stories.`data`.model.Listellipsefifteen2RowModel
import com.socialnetworking.app.modules.stories.`data`.model.Listnineteen1RowModel
import com.socialnetworking.app.modules.stories.`data`.viewmodel.StoriesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesActivity : BaseActivity<ActivityStoriesBinding>(R.layout.activity_stories) {
  private val viewModel: StoriesVM by viewModels<StoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen2RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    val listnineteenAdapter =
    ListnineteenAdapter(viewModel.listnineteenList.value?:mutableListOf())
    binding.recyclerListnineteen.adapter = listnineteenAdapter
    listnineteenAdapter.setOnItemClickListener(
    object : ListnineteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listnineteen1RowModel) {
        onClickRecyclerListnineteen(view, position, item)
      }
    }
    )
    viewModel.listnineteenList.observe(this) {
      listnineteenAdapter.updateData(it)
    }
    binding.storiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewGroup9078.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListnineteen(
    view: View,
    position: Int,
    item: Listnineteen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "STORIES_ACTIVITY"

  }
}
