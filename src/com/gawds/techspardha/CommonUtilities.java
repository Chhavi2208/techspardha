package com.gawds.techspardha;

import android.content.Context;
import android.content.Intent;

public final class CommonUtilities {
	
    static final String SERVER_URL = "http://172.6.170.29:8081/gcmUser/register"; 

    static final String SENDER_ID = "347083975190"; 

    static final String TAG = "TECHSPARDHA";

    static final String DISPLAY_MESSAGE_ACTION =
            "com.androidhive.pushnotifications.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";

    static void displayMessage(Context context, String message) {
        Intent intent = new Intent(DISPLAY_MESSAGE_ACTION);
        intent.putExtra(EXTRA_MESSAGE, message);
        context.sendBroadcast(intent);
    }
}
