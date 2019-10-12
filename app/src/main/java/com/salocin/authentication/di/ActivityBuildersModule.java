package com.salocin.authentication.di;

import com.salocin.authentication.di.auth.AuthModule;
import com.salocin.authentication.di.auth.AuthViewModelsModule;
import com.salocin.authentication.ui.auth.AuthActivity;
import com.salocin.authentication.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
            (
                    modules = {
                            AuthViewModelsModule.class,
                            AuthModule.class,
                    }
            )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
