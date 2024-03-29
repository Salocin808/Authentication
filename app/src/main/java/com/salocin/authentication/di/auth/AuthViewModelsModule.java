package com.salocin.authentication.di.auth;


import androidx.lifecycle.ViewModel;

import com.salocin.authentication.di.ViewModelKey;
import com.salocin.authentication.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}
