package com.example.sosandemergencysafety;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //hide the title bar
        getSupportActionBar().hide();


        Button editSos = findViewById(R.id.edit_SOS_button);
        Button editCall =findViewById(R.id.edit_Call_button);
        Button editLcat = findViewById(R.id.edit_Location_button);
        Button editMsg = findViewById(R.id.edit_Message_button);
        Button about = findViewById(R.id.abutn_button);


        editSos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editSos_Click();
            }
        });

        editCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCall_Intent_Click();
            }
        });

        editLcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               editLcat_Intent_Click();
            }
        });

        editMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editMsg_Click();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                about_Click();
            }
        });


    }

    public void editSos_Click(){
        Intent editSos_Intent = new Intent(this, EditSOSActivity.class);
        startActivity(editSos_Intent);
    }

    public void editCall_Intent_Click(){
        Intent editCall_Intent = new Intent(this, EditCallActivity.class);
        startActivity(editCall_Intent);
    }

    public void editLcat_Intent_Click(){
        Intent editLcat_Intent = new Intent(this, EditLcationActivity.class);
        startActivity(editLcat_Intent);
    }

    public void editMsg_Click(){
        Intent editMsg_Intent = new Intent(this, EditMessageActivity.class);
        startActivity(editMsg_Intent);
    }

    public void about_Click(){
        Intent about_Intent = new Intent(this, AboutActivity.class);
        startActivity(about_Intent);
    }
}

