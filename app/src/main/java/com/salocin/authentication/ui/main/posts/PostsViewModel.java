package com.salocin.authentication.ui.main.posts;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.salocin.authentication.SessionManager;
import com.salocin.authentication.network.main.MainApi;

import javax.inject.Inject;

public class PostsViewModel extends ViewModel {

    private static final String TAG = "PostsViewModel";

    private SessionManager sessionManager;
    private MainApi mainApi;

    @Inject
    public PostsViewModel(SessionManager sessionManager, MainApi mainApi) {
        this.sessionManager = sessionManager;
        this.mainApi = mainApi;

        Log.d(TAG, "PostsViewModel: viewmodel working...");
    }


}
