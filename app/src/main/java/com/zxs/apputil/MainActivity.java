package com.zxs.apputil;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.zxs.mylibrary.Valid;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Valid.isPhone("122");
    }
}