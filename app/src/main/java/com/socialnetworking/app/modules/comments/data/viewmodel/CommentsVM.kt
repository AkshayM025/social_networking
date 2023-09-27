package com.socialnetworking.app.modules.comments.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.socialnetworking.app.modules.comments.`data`.model.CommentsModel
import com.socialnetworking.app.modules.comments.`data`.model.CommentsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CommentsVM : ViewModel(), KoinComponent {
  val commentsModel: MutableLiveData<CommentsModel> = MutableLiveData(CommentsModel())

  var navArguments: Bundle? = null

  val commentsList: MutableLiveData<MutableList<CommentsRowModel>> =
      MutableLiveData(mutableListOf())
}
