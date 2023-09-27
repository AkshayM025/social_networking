package com.socialnetworking.app.modules.dailynew.`data`.model

import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.di.MyApp
import kotlin.String

data class DailyNewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAvariKudhra: String? = MyApp.getInstance().resources.getString(R.string.lbl_avari_kudhra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisaveryrareOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_is_a_very)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnimal: String? = MyApp.getInstance().resources.getString(R.string.lbl_animal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForest: String? = MyApp.getInstance().resources.getString(R.string.lbl_forest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRabbit: String? = MyApp.getInstance().resources.getString(R.string.lbl_rabbit)

)
