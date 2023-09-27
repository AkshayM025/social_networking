package com.socialnetworking.app.modules.trending.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_rick_onad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_40_min_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_the_mom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHuge: String? = MyApp.getInstance().resources.getString(R.string.lbl_huge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFotography: String? = MyApp.getInstance().resources.getString(R.string.lbl_fotography)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNature: String? = MyApp.getInstance().resources.getString(R.string.lbl_nature)

)
