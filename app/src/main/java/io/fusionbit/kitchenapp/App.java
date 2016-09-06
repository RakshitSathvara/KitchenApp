package io.fusionbit.kitchenapp;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import extra.Log;

/**
 * Created by rutvik on 06-09-2016 at 11:16 PM.
 */

public class App extends MultiDexApplication
{

    private static final String TAG=AppUtils.TAG+App.class.getSimpleName();

    @Override
    public void onCreate()
    {
        super.onCreate();

        Log.i(TAG,"APPLICATION CREATED AND STARTED!!!");

    }

    @Override
    protected void attachBaseContext(Context base)
    {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
