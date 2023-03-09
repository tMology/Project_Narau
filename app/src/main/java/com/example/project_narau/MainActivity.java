package com.example.project_narau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements WelcomeFragment.WelcomeListener {

    String start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.containerView,WelcomeFragment.newInstance(start))
                .commit();
    }

    @Override
    public void goToWelcomeScreen() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new WelcomeFragment() , "welcome_fragment")
                .addToBackStack(null)
                .commit();
    }
}