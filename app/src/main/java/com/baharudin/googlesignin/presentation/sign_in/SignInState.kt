package com.baharudin.googlesignin.presentation.sign_in

data class SignInState(
    val isSignInSuccesfull : Boolean = false,
    val signInError : String? = null
)
