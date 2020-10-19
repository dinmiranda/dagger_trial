package com.example.myapplication.dagger;

import com.example.myapplication.car.DieselEngine;
import com.example.myapplication.car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower() {
        return horsePower;
    }


    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
