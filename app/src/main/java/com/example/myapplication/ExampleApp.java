package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.dagger.AppComponent;
import com.example.myapplication.dagger.DaggerAppComponent;
import com.example.myapplication.dagger.DriverModule;

public class ExampleApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.factory().create(new DriverModule("Pedro"));
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
