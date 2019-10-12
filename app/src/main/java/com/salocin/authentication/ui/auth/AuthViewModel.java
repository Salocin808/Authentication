package com.salocin.authentication.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.salocin.authentication.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel(AuthApi authApi) {

        this.authApi = authApi;

        if(authApi != null)
            Log.d(TAG, "AuthViewModel: authapi injected!!!");
    }
}
