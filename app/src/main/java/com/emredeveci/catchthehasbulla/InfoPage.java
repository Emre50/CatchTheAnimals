package com.emredeveci.catchthehasbulla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void changeScreen(View view){
        Intent intent = new Intent(InfoPage.this, HomePage.class);
        startActivity(intent);
    }
}