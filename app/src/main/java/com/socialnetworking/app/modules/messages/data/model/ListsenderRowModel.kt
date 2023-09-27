package com.socialnetworking.app.modules.messages.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class ListsenderRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSender: String? = MyApp.getInstance().resources.getString(R.string.lbl_richard_alves)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessage: String? = MyApp.getInstance().resources.getString(R.string.msg_hey_bro_where)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_00_am)

)
