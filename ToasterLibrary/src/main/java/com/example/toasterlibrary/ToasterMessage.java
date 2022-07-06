package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c, String message, int duration){

        Toast.makeText(c,message, duration).show();

    }

    public static void s(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
    public static void s(Context c) {
        Toast.makeText(c,"Default Message", Toast.LENGTH_SHORT).show();
    }
}