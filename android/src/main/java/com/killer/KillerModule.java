package com.killer; // 一定要和 Kotlin 模板保持一致

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class KillerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Killer";

    public KillerModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void exitApp() {
        android.os.Process.killProcess(android.os.Process.myPid());
        // System.exit(1); // 可选
    }

}
