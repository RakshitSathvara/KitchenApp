package io.fusionbit.kitchenapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import extra.Log;

/**
 * Created by rutvik on 07-09-2016 at 10:02 AM.
 */

public class KitchenAppActivity extends AppCompatActivity
{

    private static final String TAG = AppUtils.APP_TAG + KitchenAppActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        //called only once when activity gets initialized for the first time
        super.onCreate(savedInstanceState);
        Log.i(TAG, "ACTIVITY ON CREATE");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "ACTIVITY ON START");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "ACTIVITY ON RESUME");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "ACTIVITY ON PAUSE");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, "ACTIVITY ON STOP");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "ACTIVITY ON RESTART");
    }

    @Override
    protected void onDestroy()
    {
        //only and only called when app is closed using back button
        Log.i(TAG, "ACTIVITY ON DESTROY");
        super.onDestroy();
    }
}
