package com.socialnetworking.app.modules.live.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.live.`data`.model.LiveModel
import org.koin.core.KoinComponent

class LiveVM : ViewModel(), KoinComponent {
  val liveModel: MutableLiveData<LiveModel> = MutableLiveData(LiveModel())

  var navArguments: Bundle? = null
}
