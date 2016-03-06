package com.example.panda.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Panda on 03/03/2016.
 */
public class MenuActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        findViewById(R.id.promotion_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, PromotionActivity.class);
                startActivity(intent);
            }
        });

  /*findViewById(R.id.notify_demo_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startListBeaconsActivity(NotifyDemoActivity.class.getName());
      }
    });*/

        findViewById(R.id.map_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });
    }
}
