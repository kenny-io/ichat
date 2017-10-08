package com.example.ekene.ichat.core.Registeration;

/**
 * Created by EKENE on 9/23/2017.
 */

//public class RegisterationContract {
//}
import android.app.Activity;

import com.google.firebase.auth.FirebaseUser;


public interface RegisterationContract {
    interface View {
        void onRegistrationSuccess(FirebaseUser firebaseUser);

        void onRegistrationFailure(String message);
    }

    interface Presenter {
        void register(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseRegistration(Activity activity, String email, String password);
    }

    interface OnRegistrationListener {
        void onSuccess(FirebaseUser firebaseUser);

        void onFailure(String message);
    }
}
