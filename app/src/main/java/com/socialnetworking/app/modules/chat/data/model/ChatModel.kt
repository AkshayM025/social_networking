package com.socialnetworking.app.modules.chat.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGarryWiller: String? = MyApp.getInstance().resources.getString(R.string.lbl_garry_willer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHilarryhoware: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_larry_how_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloGerryim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_gerry_i_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etActionValue: String? = null
)
