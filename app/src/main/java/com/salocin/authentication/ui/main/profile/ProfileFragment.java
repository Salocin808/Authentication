package com.salocin.authentication.ui.main.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.salocin.authentication.R;
import com.salocin.authentication.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class ProfileFragment extends DaggerFragment {

    private static final String TAG = "ProfileFragment";

    private ProfileViewModel viewModel;

    @Inject
    public ViewModelProviderFactory providerFactory;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Toast.makeText(getActivity(), "Profile Fragment", Toast.LENGTH_LONG).show();

        viewModel = ViewModelProviders.of(this,providerFactory).get(ProfileViewModel.class);

        return inflater.inflate(R.layout.fragment_profile, container,false);
    }
}
