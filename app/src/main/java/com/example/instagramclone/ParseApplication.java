package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cIkh9A7eQJloxOK3hhAGNwmCCxnVhaYpj68dKdHZ")
                .clientKey("PgWdEczgOzd13IRBk6l0plJsq9LXMkC1A0TLHLZK")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
