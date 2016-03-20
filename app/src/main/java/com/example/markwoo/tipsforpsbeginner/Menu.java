package com.example.markwoo.tipsforpsbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    private ImageView menu1, menu2, menu3, menu4, menu5, menu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu1 = (ImageView)findViewById(R.id.menu1);
        menu2 = (ImageView)findViewById(R.id.menu2);
        menu3 = (ImageView)findViewById(R.id.menu3);
        menu4 = (ImageView)findViewById(R.id.menu4);
        menu5 = (ImageView)findViewById(R.id.menu5);
        menu6 = (ImageView)findViewById(R.id.menu6);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu1Panel.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu2History.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu3Layer.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu4Shortcut.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu5Tutorial.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Menu6About.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);


            }
        });
    }
}
