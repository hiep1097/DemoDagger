package com.example.hiephoangvan.demodagger;

import android.app.Application;
import android.content.Context;

import com.example.hiephoangvan.demodagger.data.DataManager;
import com.example.hiephoangvan.demodagger.di.component.ApplicationComponent;
import com.example.hiephoangvan.demodagger.di.component.DaggerApplicationComponent;
import com.example.hiephoangvan.demodagger.di.module.ApplicationModule;

import javax.inject.Inject;

public class DemoDaggerApplication extends Application {
    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoDaggerApplication get(Context context) {
        return (DemoDaggerApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}
