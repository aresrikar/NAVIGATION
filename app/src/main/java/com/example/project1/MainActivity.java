package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnv = findViewById(R.id.BN);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                if(item.getItemId()==R.menu.)

                if (item.getItemId() == R.id.menuid)
                {
                    Intent i = new Intent(MainActivity.this , Project_K.class);
                    startActivity(i);

                }

                if (item.getItemId() == R.id.menuid)
                {
//                    Intent i = new Intent(MainActivity.this , Project_K.class);
//                    startActivity(i);

                }

                return false;

            }

        });
    }
}