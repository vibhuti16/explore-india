package com.udacity.exploreindia.ui.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.udacity.exploreindia.R;
import com.udacity.exploreindia.repo.PreferenceRepository;
import com.udacity.exploreindia.ui.splash.SplashActivity;

public class WelcomeActivity extends AppCompatActivity {

    private PreferenceRepository prefRepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        prefRepo = new PreferenceRepository(getApplicationContext());

        TextView tvTest = findViewById(R.id.a_welcome_tv_test);

        tvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefRepo.setFirstTimeLaunch(false);
                Intent intent = new Intent(WelcomeActivity.this, SplashActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
