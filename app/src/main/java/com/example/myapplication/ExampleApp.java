package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.dagger.AppComponent;
import com.example.myapplication.dagger.DaggerAppComponent;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
