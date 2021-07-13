package com.example.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PhoneTester extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IPhone iphone12 = new IPhone("12 Pro Max", 100, "jawwal", "Zing");
        Galaxy s21 = new Galaxy("S21 Ultea", 99, "BCI", "Ring Ring Ring!");

    }
}