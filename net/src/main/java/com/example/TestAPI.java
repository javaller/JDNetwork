package com.example;

import com.example.model.DataFromServer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by VOpolski on 25.08.2016.
 */
public interface TestAPI {

    @GET("test1.json")
    Call<DataFromServer> getUsers();
}
