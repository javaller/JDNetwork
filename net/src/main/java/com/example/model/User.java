package com.example.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by VOpolski on 25.08.2016.
 */
public class User {

    private String id;
    private String index;
    private String guid;
    private Boolean isActive;
    private String balance;
    private String picture;
    private Integer age;
    private String eyeColor;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;
    private String address;
    private String about;
    private String registered;
    private Double latitude;
    private Double longitude;
    private String[] tags;
    private Friend[] friends;
    private String greeting;
    private String favoriteFruit;

    public String getId() {
        return id;
    }

    public String getIndex() {
        return index;
    }

    public String getGuid() {
        return guid;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Double getDoubleBallans() {
        Double doubleBallans = new Double(balance.substring(1).replace(",", ""));
        return doubleBallans;
    }

    public String getAbout() {
        return about;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getCompany() {
        return company;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Integer getAge() {
        return age;
    }

    public String getPicture() {
        return picture;
    }

    public Date getDateRegistered() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss XXX", Locale.ENGLISH);
        try {
            return df.parse(registered);
        } catch (ParseException e1) {
            e1.printStackTrace();
            return null;
        }
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String[] getTags() {
        return tags;
    }

    public Friend[] getFriends() {
        return friends;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }


    /*
    {
  "users": [
    {
      "id": "576c0be3df117075ce2e59e7",
      "index": 0,
      "guid": "a17e16a3-83f6-45e9-8db9-bd89e5101ad0",
      "isActive": true,
      "balance": "$3,441.69",
      "picture": "http://placehold.it/32x32",
      "age": 36,
      "eyeColor": "blue",
      "name": "Lilia Gibbs",
      "gender": "female",
      "company": "TELEPARK",
      "email": "liliagibbs@telepark.com",
      "phone": "+1 (908) 445-2270",
      "address": "914 Juliana Place, Vienna, Minnesota, 6789",
      "about": "Occaecat Lorem re
     */
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
}
