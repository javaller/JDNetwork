package com.example;

import com.example.model.DataFromServer;
import com.example.model.Friend;
import com.example.model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyClass {

    public static void main(String[] args) {

        DataFromServer dfs = new DataFromServer();

        String url = "https://raw.githubusercontent.com/tseglevskiy/testdata/master/";

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        Gson gson = new GsonBuilder()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        TestAPI api = retrofit.create(TestAPI.class);

        try {
            dfs = api.getUsers().execute().body();

            for (int i = 0; i < dfs.users.length; i++) {

                User user = dfs.users[i];

                if (user.getDoubleBallans() > 3000) {

                    System.out.println("Name:           " + user.getName());
                    System.out.println("isActive:       " + user.getActive());
                    System.out.println("Ballance:       " + user.getDoubleBallans());
                    System.out.println("Age:            " + user.getAge());
                    System.out.println("eyeColor:       " + user.getEyeColor());
                    System.out.println("Company:        " + user.getCompany());
                    System.out.println("Email:          " + user.getEmail());
                    System.out.println("Phone:          " + user.getPhone());
                    System.out.println("Adress:         " + user.getAddress());
                    System.out.println("Register Date:   " + user.getDateRegistered());
                    System.out.println("Tags:               ");

                    for (int j = 0; j < 2; j++) {
                        System.out.println("                        " + user.getTags()[j]);
                    }

                    System.out.println("Friends:               ");

                    List<Friend> friends = new ArrayList<>(Arrays.asList(user.getFriends()));

                    for (Friend fr : friends) {
                        System.out.println("                    " + fr.getId() + " - " + fr.getName());
                    }

                    System.out.println("Favoruite fruits: " + user.getFavoriteFruit());
                    System.out.println("____________________________________________________");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


                 /*
    registered": "2014-10-28T04:02:22 -03:00",
      "latitude": -18.661293,
      "longitude": 60.866961,
      "tags": [
        "aliqua",
        "enim",
        "sunt",
        "tempor",
        "est",
        "anim",
        "elit"
      ],
      "friends": [
        {
          "id": 0,
          "name": "Alexandra Banks"
        },
        {
          "id": 1,
          "name": "Lois Olsen"
        },
        {
          "id": 2,
          "name": "Jeannie Rojas"
        }
      ],
      "greeting": "Hello, Lilia Gibbs! You have 9 unread messages.",
      "favoriteFruit": "apple"
    }
     */

                  /*
    {
  "users": [
    {
      "address": "914 Juliana Place, Vienna, Minnesota, 6789",
      "about": "Occaecat Lorem re
     */


