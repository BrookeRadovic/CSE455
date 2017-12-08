package io.atsume.randomjar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ////////////////  help button function  ////////////////////////////////
        Button settings_button1 = (Button) findViewById(R.id.settings_button1_help);
        settings_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settings.this, helpActivity.class));
            }
        });

        ////////////////  credits button function  ////////////////////////////////
        Button settings_button2 = (Button) findViewById(R.id.settings_button2_credits);
        settings_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settings.this, credits.class));
            }
        });

        ////////////////  temporary to activity_temp button function  ////////////////////////////////
        Button settings_button3 = (Button) findViewById(R.id.settings_button3);
        settings_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(settings.this, tempActivity.class));
            }
        });
    }
}
