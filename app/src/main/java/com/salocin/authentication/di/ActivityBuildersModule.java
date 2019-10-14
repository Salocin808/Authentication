package com.salocin.authentication.di;

import com.salocin.authentication.di.auth.AuthModule;
import com.salocin.authentication.di.auth.AuthScope;
import com.salocin.authentication.di.auth.AuthViewModelsModule;
import com.salocin.authentication.di.main.MainFragmentBuildersModule;
import com.salocin.authentication.di.main.MainModule;
import com.salocin.authentication.di.main.MainScope;
import com.salocin.authentication.di.main.MainViewModelsModule;
import com.salocin.authentication.ui.auth.AuthActivity;
import com.salocin.authentication.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector
            (
                    modules = {
                            AuthViewModelsModule.class,
                            AuthModule.class,
                    }
            )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector
            (
                    modules = {
                            MainFragmentBuildersModule.class,
                            MainViewModelsModule.class,
                            MainModule.class,
                    }
            )
    abstract MainActivity contributeMainActivity();

}
