package com.socialnetworking.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.socialnetworking.app.R
import com.socialnetworking.app.appcomponents.base.BaseActivity
import com.socialnetworking.app.databinding.ActivitySignUpBinding
import com.socialnetworking.app.extensions.NoInternetConnection
import com.socialnetworking.app.extensions.isJSONObject
import com.socialnetworking.app.extensions.showProgressDialog
import com.socialnetworking.app.modules.signup.`data`.viewmodel.SignUpVM
import com.socialnetworking.app.modules.trendingcontainer.ui.TrendingContainerActivity
import com.socialnetworking.app.network.models.createregister.CreateRegisterResponse
import com.socialnetworking.app.network.resources.ErrorResponse
import com.socialnetworking.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  override fun addObservers() {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@SignUpActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@SignUpActivity.showProgressDialog()
      } else  {
        progressDialog?.dismiss()
      }
    }
    viewModel.createRegisterLiveData.observe(this@SignUpActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateRegister(it)
      } else if(it is ErrorResponse)  {
        onErrorCreateRegister(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>) {
    viewModel.bindCreateRegisterResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("id",Gson().toJson(viewModel.createRegisterLiveData.value?.getSuccessResponse()?.))
    val destIntent = TrendingContainerActivity.getIntent(this, destBundle)
    startActivity(destIntent)
  }

  private fun onErrorCreateRegister(exception: Exception) {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
            else JSONObject()
        val errMessage = if(!errorObject.optString("message").isNullOrEmpty()) {
          errorObject.optString("message").toString()
        } else {
           exception.response()?.message()?:""
        }
        Toast.makeText(this@SignUpActivity,errMessage,Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "SIGN_UP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
