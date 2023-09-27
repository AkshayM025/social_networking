package com.socialnetworking.app.modules.storiesandtweets.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class ListsendRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPost: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_post)

)
