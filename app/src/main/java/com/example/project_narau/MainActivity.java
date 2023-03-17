package com.example.project_narau;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements WelcomeFragment.WelcomeListener, Register.RegisterListener, HomepageFragment.HomepageListener, LoginFragment.LoginListener {

    FirebaseAuth mAuth = FirebaseAuth.getInstance();

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
    public void register() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new Register(), "register_fragment")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void goToWelcomeScreen() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new WelcomeFragment() , "welcome_fragment")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void goToHomepage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new HomepageFragment(), "homepage_fragment")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void goToRegister() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new Register(),"our_register_fragment")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void goToLogin() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerView, new LoginFragment(), "login_fragment")
                .addToBackStack(null)
                .commit();
    }
}