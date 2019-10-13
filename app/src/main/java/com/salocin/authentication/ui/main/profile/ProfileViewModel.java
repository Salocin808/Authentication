package com.salocin.authentication.ui.main.profile;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.salocin.authentication.SessionManager;

import javax.inject.Inject;

public class ProfileViewModel extends ViewModel {
    private static final String TAG = "ProfileViewModel";


    @Inject
    public ProfileViewModel(SessionManager sessionManager) {
        Log.d(TAG, "ProfileViewModel: injected");
    }
}
