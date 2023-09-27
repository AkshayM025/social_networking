package com.socialnetworking.app.modules.dailynewtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.dailynewtabcontainer.`data`.model.DailyNewTabContainerModel
import org.koin.core.KoinComponent

class DailyNewTabContainerVM : ViewModel(), KoinComponent {
  val dailyNewTabContainerModel: MutableLiveData<DailyNewTabContainerModel> =
      MutableLiveData(DailyNewTabContainerModel())

  var navArguments: Bundle? = null
}
