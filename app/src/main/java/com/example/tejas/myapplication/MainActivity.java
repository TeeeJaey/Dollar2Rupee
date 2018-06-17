package com.example.tejas.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {


    public void changePic(View view)
    {
        ImageView image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.dollar);

    }
        public void change(View view)
    {

        EditText dollar = (EditText) findViewById(R.id.dollar);

        String dola = dollar.getText().toString().trim();
        if(TextUtils.isEmpty(dola)) {
            Toast.makeText(this, "Enter amount!", Toast.LENGTH_LONG).show();
            return;
        }

        Double dol = Double.parseDouble(dollar.getText().toString());
        Double rup = dol * 67.53;


        TextView rupview = (TextView)   findViewById(R.id.rupee);
        rupview.setText(rup.toString());

        ImageView image = (ImageView) findViewById(R.id.img);
        image.setImageResource(R.drawable.rupee);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}