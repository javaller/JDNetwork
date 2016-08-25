package com.example;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by VOpolski on 25.08.2016.
 */
public class Test {

    public static Double getBallansFromString(String stringBallans){
        Double doubleBallans =  new Double(stringBallans.substring(1).replace(",", ""));
        return doubleBallans;
    }



    public static void main(String[] args) {

        String sBallans = "$3,441.69";
        System.out.println(getBallansFromString(sBallans));

        Double [] arr = {1d,2d,3d,4d,5d,6d,2d};
        int i = 0;
        while (i < arr.length && arr[i] == 2d) {
            System.out.println(arr[i]);
            i ++;
        }

                              String sDate = "2014-10-28T04:02:22 -03:00";
//                    String sDate = "2001-07-04T12:08:56 -07:00";




    }
}
