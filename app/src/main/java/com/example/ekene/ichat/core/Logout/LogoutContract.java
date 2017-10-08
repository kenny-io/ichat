package com.example.ekene.ichat.core.Logout;

/**
 * Created by EKENE on 9/23/2017.
 */

//public class LogoutContract {
//}

public interface LogoutContract {
    interface View {
        void onLogoutSuccess(String message);

        void onLogoutFailure(String message);
    }

    interface Presenter {
        void logout();
    }

    interface Interactor {
        void performFirebaseLogout();
    }

    interface OnLogoutListener {
        void onSuccess(String message);

        void onFailure(String message);
    }
}

