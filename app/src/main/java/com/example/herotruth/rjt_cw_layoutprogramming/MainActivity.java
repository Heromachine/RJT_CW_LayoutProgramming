package com.example.herotruth.rjt_cw_layoutprogramming;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //BUTTON ONE SET UP-------------------------------------------------------------------------

        Button btn01 = new Button(MainActivity.this);
        ViewGroup.LayoutParams  params =
            new LinearLayout.LayoutParams(600, 600);//ViewGroup.LayoutParams.MATCH_PARENT, 0); // ViewGroup.LayoutParams.WRAP_CONTENT);
        ViewGroup.LayoutParams layoutParams =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        params.height = 200;
        params.width = 200;

        btn01.setText("PLAY");
        btn01.setLayoutParams(params);
        btn01.setY(900);



        LinearLayout linearLayout = new LinearLayout(MainActivity.this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.BLUE);

        linearLayout.addView(btn01);

        addContentView(linearLayout, layoutParams);


        btn01.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent play = new Intent(MainActivity.this, MyMusicService.class);

                startService(play);

            }
        });
    }
}
