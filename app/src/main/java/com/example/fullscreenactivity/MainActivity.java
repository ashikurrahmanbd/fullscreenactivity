package com.example.fullscreenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN; //this line need to add for using the Flag Full Screen

//Also On the Style xml file need to add .NoActionBar

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //removing Notification bar
        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);




    }
}
