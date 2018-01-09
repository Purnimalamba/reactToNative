

package com.reacttonative;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.ReactActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class ActivityStarter extends ReactContextBaseJavaModule {

    ActivityStarter(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ActivityStarter";
    }

    @ReactMethod
    void navigateToExample() {
        Activity ActivityStarter1 = getCurrentActivity();
        Intent intent = new Intent(ActivityStarter1, androidExample.class);
        ActivityStarter1.startActivity(intent);
    }

    
}