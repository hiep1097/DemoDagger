package com.example.hiephoangvan.demodagger.di.component;

import com.example.hiephoangvan.demodagger.MainActivity;
import com.example.hiephoangvan.demodagger.di.PerActivity;
import com.example.hiephoangvan.demodagger.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
