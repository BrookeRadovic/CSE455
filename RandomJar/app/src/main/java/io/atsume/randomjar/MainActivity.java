package io.atsume.randomjar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ////////////////  MyLists button function  ////////////////////////////////
        Button main_button1 = (Button) findViewById(R.id.main_button1_mylists);
        main_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MainActivity.this, mylists.class));
            }
        });

        ////////////////  Settings button function  ////////////////////////////////
        Button main_button2 = (Button) findViewById(R.id.main_button2_settings);
        main_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MainActivity.this, settings.class));
            }
        });

    }
}
