package com.example.myapplication.dagger;

import com.example.myapplication.car.Engine;
import com.example.myapplication.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
