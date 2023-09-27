package com.socialnetworking.app.modules.trendingcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.trendingcontainer.`data`.model.TrendingContainerModel
import org.koin.core.KoinComponent

class TrendingContainerVM : ViewModel(), KoinComponent {
  val trendingContainerModel: MutableLiveData<TrendingContainerModel> =
      MutableLiveData(TrendingContainerModel())

  var navArguments: Bundle? = null
}
