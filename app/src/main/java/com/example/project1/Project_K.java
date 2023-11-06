package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Project_K extends AppCompatActivity {
   BottomNavigationView bnv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_k);
        bnv2 = findViewById(R.id.BN2);
        bnv2.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                if(item.getItemId()==R.menu.)

                if (item.getItemId() == R.id.menuid)
                {
//                    Intent i = new Intent(MainActivity.this , Project_K.class);
//                    startActivity(i);

                }

                if (item.getItemId() == R.id.menuid2)
                {
                    Intent i = new Intent(Project_K.this, MainActivity.class );
                    startActivity(i);

                }

                return false;

            }

        });
    }
}