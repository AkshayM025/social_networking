package com.socialnetworking.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.socialnetworking.app.appcomponents.utility.PreferenceHelper
import com.socialnetworking.app.constants.role
import com.socialnetworking.app.modules.signup.`data`.model.SignUpModel
import com.socialnetworking.app.network.models.createregister.CreateRegisterRequest
import com.socialnetworking.app.network.models.createregister.CreateRegisterResponse
import com.socialnetworking.app.network.repository.NetworkRepository
import com.socialnetworking.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class SignUpVM : ViewModel(), KoinComponent {
  val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      createRegisterRequest = CreateRegisterRequest(
          password = signUpModel.value?.etFrameThirtyFourValue,
          role = role.USER,
          name = signUpModel.value?.etFrameThirtyValue,
          email = signUpModel.value?.etFrameThirtyFiveValue,
          username = signUpModel.value?.etFrameThirtyFiveValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val signUpModelValue = signUpModel.value ?:SignUpModel()
    prefs.setId(response.data?.id)
    signUpModel.value = signUpModelValue
  }
}
