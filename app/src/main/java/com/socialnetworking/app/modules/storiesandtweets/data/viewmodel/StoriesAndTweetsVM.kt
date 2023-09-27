package com.socialnetworking.app.modules.storiesandtweets.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.ListellipsetwelveRowModel
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.ListsendRowModel
import com.socialnetworking.app.modules.storiesandtweets.`data`.model.StoriesAndTweetsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesAndTweetsVM : ViewModel(), KoinComponent {
  val storiesAndTweetsModel: MutableLiveData<StoriesAndTweetsModel> =
      MutableLiveData(StoriesAndTweetsModel())

  var navArguments: Bundle? = null

  val listsendList: MutableLiveData<MutableList<ListsendRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsetwelveList: MutableLiveData<MutableList<ListellipsetwelveRowModel>> =
      MutableLiveData(mutableListOf())
}
