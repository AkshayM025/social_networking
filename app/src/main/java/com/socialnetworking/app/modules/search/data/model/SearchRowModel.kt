package com.socialnetworking.app.modules.search.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class SearchRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_kevin_allsrub)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRelationship: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_e_friends)

)
