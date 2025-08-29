package com.killer;

import com.killer.BuildConfig;
import androidx.annotation.Nullable;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

public class KillerPackage extends TurboReactPackage {

    @Nullable
    @Override
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        if (name.equals(KillerModule.NAME)) {
            return new KillerModule(reactContext);
        } else {
            return null;
        }
    }

    @Override
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return () -> {
            final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
            // boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            moduleInfos.put(
                    KillerModule.NAME,
                    new ReactModuleInfo(
                            KillerModule.NAME,
                            KillerModule.NAME,
                            false, // canOverrideExistingModule
                            false, // needsEagerInit
                            false, // hasConstants
                            false, // isCxxModule
                            false // isTurboModule
            ));
            return moduleInfos;
        };
    }
}
