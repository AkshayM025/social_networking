package com.socialnetworking.app.modules.streamtabcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.streamtabcontainer.`data`.model.StreamTabContainerModel
import org.koin.core.KoinComponent

class StreamTabContainerVM : ViewModel(), KoinComponent {
  val streamTabContainerModel: MutableLiveData<StreamTabContainerModel> =
      MutableLiveData(StreamTabContainerModel())

  var navArguments: Bundle? = null
}
