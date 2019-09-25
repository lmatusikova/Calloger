package com.general.calloger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    private static Context context;
    private BottomAppBar bottomAppBar;
    private Drawable settingsDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // setUpBottomAppBar();
        settingsDrawable = getResources().getDrawable(R.drawable.three_dots);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        setSupportActionBar(bottomAppBar);
        bottomAppBar.setOverflowIcon(settingsDrawable);

       // context = this;

     //   Intent intro = new Intent(this, LoginActivity.class);
      //  intro.setFlags(intro.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
      //  startActivity(intro);

    //
    }

    //Inflate menu to bottom bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
