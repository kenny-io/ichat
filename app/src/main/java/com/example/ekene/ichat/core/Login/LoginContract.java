package com.example.ekene.ichat.core.Login;
import android.app.Activity;
/**
 * Created by EKENE on 9/23/2017.
 */
//
//public class LoginContract {
//}

public interface LoginContract {
    interface View {
        void onLoginSuccess(String message);

        void onLoginFailure(String message);
    }

    interface Presenter {
        void login(Activity activity, String email, String password);
    }

    interface Interactor {
        void performFirebaseLogin(Activity activity, String email, String password);
    }

    interface OnLoginListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}

