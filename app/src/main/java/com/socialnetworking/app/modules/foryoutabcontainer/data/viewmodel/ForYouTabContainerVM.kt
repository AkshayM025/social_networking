package com.socialnetworking.app.modules.foryoutabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.foryoutabcontainer.`data`.model.ForYouTabContainerModel
import org.koin.core.KoinComponent

class ForYouTabContainerVM : ViewModel(), KoinComponent {
  val forYouTabContainerModel: MutableLiveData<ForYouTabContainerModel> =
      MutableLiveData(ForYouTabContainerModel())

  var navArguments: Bundle? = null
}
