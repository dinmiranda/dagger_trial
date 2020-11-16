package com.example.myapplication.dagger;

import com.example.myapplication.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    String driverName;

    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver providerDriver() {
        return new Driver(driverName);
    }
}
