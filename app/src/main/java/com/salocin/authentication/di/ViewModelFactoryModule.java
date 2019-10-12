package com.salocin.authentication.di;

import androidx.lifecycle.ViewModelProvider;

import com.salocin.authentication.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
