package com.example.awesomememory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  {

TextView textView1,textView2;
ImageView iv_11, iv_12, iv_13, iv_14,iv_21, iv_22, iv_23, iv_24,iv_31, iv_32, iv_33, iv_34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);

        iv_11 = (ImageView) findViewById(R.id._11);
        iv_12 = (ImageView) findViewById(R.id._12);
        iv_13 = (ImageView) findViewById(R.id._13);
        iv_14 = (ImageView) findViewById(R.id._14);

        iv_21 = (ImageView) findViewById(R.id._21);
        iv_22 = (ImageView) findViewById(R.id._22);
        iv_23 = (ImageView) findViewById(R.id._23);
        iv_24 = (ImageView) findViewById(R.id._24);

        iv_31 = (ImageView) findViewById(R.id._31);
        iv_32 = (ImageView) findViewById(R.id._32);
        iv_33 = (ImageView) findViewById(R.id._33);
        iv_34 = (ImageView) findViewById(R.id._34);
    }


}