package com.jetbreed.sharedpreferencev2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText jsf, hibernate, spring, android, junit;
    Button btnSharedPref, btnViewSharePref;
    String jsfStr, hibernateStr, springStr, androidStr, junitStr;

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jsf = findViewById(R.id.jsfx);
        hibernate = findViewById(R.id.hibernate);
        spring = findViewById(R.id.spring);
        android = findViewById(R.id.android);
        junit = findViewById(R.id.junit);

        btnSharedPref = findViewById(R.id.btnSharePref);

        btnViewSharePref = findViewById(R.id.btnViewPref);

        btnSharedPref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jsfStr = jsf.getText().toString();
                hibernateStr = hibernate.getText().toString();
                springStr = spring.getText().toString();
                androidStr = android.getText().toString();
                junitStr = junit.getText().toString();

                sp = getSharedPreferences("CoursePref", MODE_PRIVATE);

                SharedPreferences.Editor editor = sp.edit();

                editor.putString("jsfStr", jsfStr);
                editor.putString("hibernateStr", hibernateStr);
                editor.putString("springStr", springStr);
                editor.putString("androidStr", androidStr);
                editor.putString("junitStr", junitStr);

                editor.commit();

                Toast.makeText(MainActivity.this, "Preference Saved Successfully", Toast.LENGTH_SHORT).show();

            }
        });


        btnViewSharePref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewPrefIntent = new Intent(MainActivity.this, ViewPref.class);
                startActivity(viewPrefIntent);
            }
        });
    }
//On your on going project, with a button, submit and save all
// the plaintext strings to your SharedPreference.

//All use a button to navigate to a new activity where you can view your
//    SharedPreference.
  
//    Furthermore, create extra five layouts (activities) with
//    accompanying buttons for navigations.


}