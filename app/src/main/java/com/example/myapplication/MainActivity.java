package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.car.Car;
import com.example.myapplication.dagger.ActivityComponent;
import com.example.myapplication.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .appComponent(((ExampleApp) getApplication()).getAppComponent())
                .build();

        component.inject(this);
        car1.drive();
        car2.drive();
    }
}