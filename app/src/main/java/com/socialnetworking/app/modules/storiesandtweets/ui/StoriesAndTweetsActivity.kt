package com.socialnetworking.app.modules.storiesandtweets.ui

import android.view.View
import androidx.activity.viewModels
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.appcomponents.views.ImagePickerFragmentDialog
import com.socialnetworking.app.databinding.ActivityStoriesAndTweetsBinding
import com.socialnetworking.app.modules.search.ui.SearchActivity
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.ListellipsetwelveRowModel
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.ListsendRowModel
import com.socialnetworking.app.modules.storiesandtweets.`data`.viewmodel.StoriesAndTweetsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesAndTweetsActivity :
    BaseActivity<ActivityStoriesAndTweetsBinding>(R.layout.activity_stories_and_tweets) {
  private val viewModel: StoriesAndTweetsVM by viewModels<StoriesAndTweetsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsendAdapter = ListsendAdapter(viewModel.listsendList.value?:mutableListOf())
    binding.recyclerListsend.adapter = listsendAdapter
    listsendAdapter.setOnItemClickListener(
    object : ListsendAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsendRowModel) {
        onClickRecyclerListsend(view, position, item)
      }
    }
    )
    viewModel.listsendList.observe(this) {
      listsendAdapter.updateData(it)
    }
    val listellipsetwelveAdapter =
    ListellipsetwelveAdapter(viewModel.listellipsetwelveList.value?:mutableListOf())
    binding.recyclerListellipsetwelve.adapter = listellipsetwelveAdapter
    listellipsetwelveAdapter.setOnItemClickListener(
    object : ListellipsetwelveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsetwelveRowModel) {
        onClickRecyclerListellipsetwelve(view, position, item)
      }
    }
    )
    viewModel.listellipsetwelveList.observe(this) {
      listellipsetwelveAdapter.updateData(it)
    }
    binding.storiesAndTweetsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.searchViewGroup9088.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerListsend(
      view: View,
      position: Int,
      item: ListsendRowModel
    ): Unit {
      when(view.id) {
      }
    }

    fun onClickRecyclerListellipsetwelve(
      view: View,
      position: Int,
      item: ListellipsetwelveRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "STORIES_AND_TWEETS_ACTIVITY"

    }
  }
