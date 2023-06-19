package com.jetbreed.sharedpreferencev2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewPref extends AppCompatActivity {

    TextView jsfx, hibernatex, springx, androidx, junitx;
    SharedPreferences sp;

    String jsfStr, hibernateStr, springStr, androidStr, junitStr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pref);

        jsfx = findViewById(R.id.jsfx);
        hibernatex = findViewById(R.id.hibernatex);
        springx = findViewById(R.id.springx);
        androidx = findViewById(R.id.androidx);
        junitx = findViewById(R.id.junitx);

        sp = getApplicationContext().getSharedPreferences("CoursePref", MODE_PRIVATE);

        jsfStr = sp.getString("jsfStr", "");
        hibernateStr = sp.getString("hibernateStr", "");
        springStr = sp.getString("springStr", "");
        androidStr = sp.getString("androidStr", "");
        junitStr = sp.getString("junitStr", "");

        jsfx.setText(jsfStr);
        hibernatex.setText(hibernateStr);
        springx.setText(springStr);
        androidx.setText(androidStr);
        junitx.setText(junitStr);

        Toast.makeText(this, "My Share Preferences", Toast.LENGTH_SHORT).show();

    }
}
