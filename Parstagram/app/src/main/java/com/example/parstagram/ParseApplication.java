package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication  extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("a3rgdmXbjavcUdlmYhFfExiIlPCQP1SIfEFjWSOq")
                .clientKey("ytrmCb8rXEjnRSHA94rk9tARUKKg9gfW9wKiw3qY")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
