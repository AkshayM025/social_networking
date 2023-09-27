package com.socialnetworking.app.modules.trendingposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.trendingposts.`data`.model.TrendingPostsModel
import com.socialnetworking.app.modules.trendingposts.`data`.model.TrendingpostsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingPostsVM : ViewModel(), KoinComponent {
  val trendingPostsModel: MutableLiveData<TrendingPostsModel> =
      MutableLiveData(TrendingPostsModel())

  var navArguments: Bundle? = null

  val trendingpostsList: MutableLiveData<MutableList<TrendingpostsRowModel>> =
      MutableLiveData(mutableListOf())
}
