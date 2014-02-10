package com.safirio.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by noelh on 2/9/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "crip4hmJ1EipdkXIAcZKfJo0tRjXq5zteh563sFo", "7YoYXvECojOCuk1F6kTGFzpl3pyKxpgJsq7hTIa0");


    }

}
