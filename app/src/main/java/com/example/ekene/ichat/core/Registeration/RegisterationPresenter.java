package com.example.ekene.ichat.core.Registeration;

/**
 * Created by EKENE on 9/23/2017.
 */


import android.app.Activity;

import com.google.firebase.auth.FirebaseUser;



public class RegisterationPresenter implements RegisterationContract.Presenter, RegisterationContract.OnRegistrationListener {
    private RegisterationContract.View mRegisterView;
    private RegisterationInteractor mRegisterInteractor;

    public RegisterationPresenter(RegisterationContract.View registerView) {
        this.mRegisterView = registerView;
        mRegisterInteractor = new RegisterationInteractor(this);
    }

    @Override
    public void register(Activity activity, String email, String password) {
        mRegisterInteractor.performFirebaseRegistration(activity, email, password);
    }

    @Override
    public void onSuccess(FirebaseUser firebaseUser) {
        mRegisterView.onRegistrationSuccess(firebaseUser);
    }

    @Override
    public void onFailure(String message) {
        mRegisterView.onRegistrationFailure(message);
    }
}

