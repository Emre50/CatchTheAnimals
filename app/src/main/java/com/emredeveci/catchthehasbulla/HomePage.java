package com.emredeveci.catchthehasbulla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void changeScreen(View view){

        Intent intent = new Intent(HomePage.this,MainActivity.class);
        startActivity(intent);

    }
    public void changeScreen2(View view){
        Intent intent = new Intent(HomePage.this, InfoPage.class);
        startActivity(intent);
    }

}