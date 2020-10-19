package com.example.myapplication.dagger;

import com.example.myapplication.MainActivity;
import com.example.myapplication.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        ActivityComponent.Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        ActivityComponent.Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}
