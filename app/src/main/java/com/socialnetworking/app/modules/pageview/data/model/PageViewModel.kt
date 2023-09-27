package com.socialnetworking.app.modules.pageview.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class PageViewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHalifordLuxury: String? =
      MyApp.getInstance().resources.getString(R.string.msg_haliford_luxury)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_halford_hotel_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_800)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySixValue: String? = null
)
