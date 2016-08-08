package com.vamsi.myappportfolio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }


    public void popularMovies(View view){

        Toast.makeText(Home.this, "This button will launch my Popular Movies App!", Toast.LENGTH_SHORT).show();

    }


    public void stockHawk(View view){

        Toast.makeText(Home.this, "This button will launch my Stock Hawk App!", Toast.LENGTH_SHORT).show();

    }


    public void builditBigger(View view){

        Toast.makeText(Home.this, "This button will launch my Build it Bigger App!", Toast.LENGTH_SHORT).show();

    }


    public void makeYourAppMaterial(View view){

        Toast.makeText(Home.this, "This button will launch my Make Your App Material App!", Toast.LENGTH_SHORT).show();

    }


    public void goUbiquitous(View view){

        Toast.makeText(Home.this, "This button will launch my Go Ubiquitous App!", Toast.LENGTH_SHORT).show();

    }


    public void capstone(View view){

        Toast.makeText(Home.this, "This button will launch Capstone:My own App!", Toast.LENGTH_SHORT).show();

    }




}
