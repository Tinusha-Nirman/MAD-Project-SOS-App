package com.example.sosandemergencysafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//hide the title bar
     getSupportActionBar().hide();

//Declare all buttons
        Button settingBtn = findViewById(R.id.setting_btn);

        final Intent intent = new Intent(this, settingActivity.class);


//declare button click methods
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
