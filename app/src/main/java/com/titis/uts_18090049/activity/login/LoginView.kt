package com.titis.uts_18090049.activity.login

import com.titis.uts_18090049.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}