package com.example.android.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Class07Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class07);
    }

    public void launchActivity(View view) {

        Intent intent = new Intent(this, SecondActivity.class);

        Person rocio = new Person("Rocio", 25);
        intent.putExtra(Keys.PERSON, rocio);

//        intent.putExtra(Keys.STRING, "Hello, baby");
//        intent.putExtra(Keys.NUM, 100);
        startActivity(intent);


    }
}
