package com.example.karam.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    CheckBox check_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check_box = (CheckBox) findViewById(R.id.check_box);

        SharedPreferences sp = getSharedPreferences("user_info" , MODE_PRIVATE);

        String saved_value = sp.getString("remember", "");

        if(saved_value.equals("yes"));
        {
            Intent i = new Intent(MainActivity.this , Main2Activity.class);
            startActivity(i);
        }
    }
 public void login(View v)
{

    Boolean box_value =  check_box.isChecked();


    if(box_value)
    {

        SharedPreferences.Editor sp = getSharedPreferences("user_info" , MODE_PRIVATE).edit();

        sp.putString("remember","yes");

        sp.commit();

    }


    Intent i = new Intent(MainActivity.this , Main2Activity.class);
    startActivity(i);
}
}



