package com.example.model;

import com.example.TestAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.example.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by VOpolski on 25.08.2016.
 */
public class DataFromServer {

    public User[] users;

    public DataFromServer() {
    }

    public DataFromServer(User[] users) {
        this.users = users;
    }


}
