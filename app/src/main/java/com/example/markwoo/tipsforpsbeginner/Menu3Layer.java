package com.example.markwoo.tipsforpsbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu3Layer extends AppCompatActivity {
    private Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3_layer);
        buttonBack = (Button)findViewById(R.id.Back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu3Layer.this, Menu.class);
                //intent.putExtra("teamA",scoreTeamA);
                startActivity(intent);
                finish();
            }
        });
    }
}
