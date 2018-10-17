package com.example.hiephoangvan.demodagger.di.component;

import android.app.Application;
import android.content.Context;

import com.example.hiephoangvan.demodagger.DemoDaggerApplication;
import com.example.hiephoangvan.demodagger.data.DataManager;
import com.example.hiephoangvan.demodagger.data.DbHelper;
import com.example.hiephoangvan.demodagger.data.SharedPrefsHelper;
import com.example.hiephoangvan.demodagger.di.ApplicationContext;
import com.example.hiephoangvan.demodagger.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoDaggerApplication demoDaggerApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
