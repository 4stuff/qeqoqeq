package com.example.okcuerun2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartNewActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void NewActivity(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void BadActivity(View v){
        Intent intent = new Intent(this, KasyActivity.class);
        startActivity(intent);
    }


}