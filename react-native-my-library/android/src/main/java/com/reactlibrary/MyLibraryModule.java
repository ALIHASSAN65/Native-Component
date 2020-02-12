// ToastModule.java

package com.reactlibrary;

import android.widget.Toast;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;
import java.util.HashMap;

public class MyLibraryModule extends ReactContextBaseJavaModule {
  private static ReactApplicationContext reactContext;

  private static final String DURATION_SHORT_KEY = "SHORT";
  private static final String DURATION_LONG_KEY = "LONG";

  MyLibraryModule(ReactApplicationContext context) {
    super(context);
    reactContext = context;
  }
    @Override
  public String getName() {
    return "MyLibrary";
  }
  @ReactMethod
  public void show(String message,   Callback errorCallback, Callback successCallback) {
    System.out.println("*************************"+message);
    successCallback.invoke("hello from natine android in the callback  library");
    //Toast.makeText(getReactApplicationContext(), message, duration).show();
  }
}