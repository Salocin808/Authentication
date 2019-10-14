package com.salocin.authentication.di.main;

import androidx.lifecycle.ViewModel;

import com.salocin.authentication.di.ViewModelKey;
import com.salocin.authentication.ui.main.posts.PostsViewModel;
import com.salocin.authentication.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewmodel(ProfileViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewmodel(PostsViewModel viewModel);
}
