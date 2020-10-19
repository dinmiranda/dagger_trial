package com.example.myapplication.dagger;

import com.example.myapplication.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver providerDriver() {
        return new Driver();
    }
}
