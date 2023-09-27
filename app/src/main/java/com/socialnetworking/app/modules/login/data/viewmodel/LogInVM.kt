package com.socialnetworking.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.socialnetworking.app.appcomponents.utility.PreferenceHelper
import com.socialnetworking.app.modules.login.`data`.model.LogInModel
import com.socialnetworking.app.network.models.createlogin.CreateLoginRequest
import com.socialnetworking.app.network.models.createlogin.CreateLoginResponse
import com.socialnetworking.app.network.repository.NetworkRepository
import com.socialnetworking.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class LogInVM : ViewModel(), KoinComponent {
  val logInModel: MutableLiveData<LogInModel> = MutableLiveData(LogInModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateLoginApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      createLoginRequest = CreateLoginRequest(
          password = logInModel.value?.etPasswordValue,
          username = logInModel.value?.etEmailidValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse) {
    val logInModelValue = logInModel.value ?:LogInModel()
    prefs.setToken(response.data?.token)
    logInModel.value = logInModelValue
  }
}
