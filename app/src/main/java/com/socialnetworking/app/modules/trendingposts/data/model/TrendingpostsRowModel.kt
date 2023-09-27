package com.socialnetworking.app.modules.trendingposts.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingpostsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_rizal_reynaldhi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_minutes_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vacation_to_bal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBali: String? = MyApp.getInstance().resources.getString(R.string.lbl_bali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDreams: String? = MyApp.getInstance().resources.getString(R.string.lbl_dreams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComments: String? = MyApp.getInstance().resources.getString(R.string.lbl_800)

)
