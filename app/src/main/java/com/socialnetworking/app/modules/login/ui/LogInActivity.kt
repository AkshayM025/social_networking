package com.socialnetworking.app.modules.login.ui

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
import com.socialnetworking.app.appcomponents.di.MyApp
import com.socialnetworking.app.databinding.ActivityLogInBinding
import com.socialnetworking.app.extensions.NoInternetConnection
import com.socialnetworking.app.extensions.isJSONObject
import com.socialnetworking.app.extensions.showProgressDialog
import com.socialnetworking.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.socialnetworking.app.modules.login.`data`.viewmodel.LogInVM
import com.socialnetworking.app.modules.trendingcontainer.ui.TrendingContainerActivity
import com.socialnetworking.app.network.models.createlogin.CreateLoginResponse
import com.socialnetworking.app.network.resources.ErrorResponse
import com.socialnetworking.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LogInActivity : BaseActivity<ActivityLogInBinding>(R.layout.activity_log_in) {
  private val viewModel: LogInVM by viewModels<LogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  override fun addObservers(): Unit {
    var progressDialog : AlertDialog? = null
    viewModel.progressLiveData.observe(this@LogInActivity) {
      if(it) {
        progressDialog?.dismiss()
        progressDialog = null
        progressDialog = this@LogInActivity.showProgressDialog()
      } else {
        progressDialog?.dismiss()
      }
    }
    viewModel.createLoginLiveData.observe(this@LogInActivity) {
      if(it is SuccessResponse) {
        val response = it.getContentIfNotHandled()
        onSuccessCreateLogin(it)
      } else if(it is ErrorResponse) {
        onErrorCreateLogin(it.data ?:Exception())
      }
    }
  }

  private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>): Unit {
    viewModel.bindCreateLoginResponse(response.data)
    val destBundle = Bundle()
    destBundle.putString("id",Gson().toJson(viewModel.createLoginLiveData.value?.getSuccessResponse()?.))
    val destIntent = TrendingContainerActivity.getIntent(this, destBundle)
    startActivity(destIntent)
    finish()
  }

  private fun onErrorCreateLogin(exception: Exception): Unit {
    when(exception) {
      is NoInternetConnection -> {
        Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
      }
      is HttpException -> {
        val errorBody = exception.response()?.errorBody()?.string()
        val errorObject = if (errorBody != null  && errorBody.isJSONObject()) JSONObject(errorBody)
        else JSONObject()
        Toast.makeText(this@LogInActivity,MyApp.getInstance().getString(R.string.msg_invalid_username_or_pa),Toast.LENGTH_LONG).show()
      }
    }
  }

  companion object {
    const val TAG: String = "LOG_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
