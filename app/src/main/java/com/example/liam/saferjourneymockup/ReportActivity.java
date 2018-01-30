package com.example.liam.saferjourneymockup;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class ReportActivity extends AppCompatActivity {
    private ImageView userAvatar;
    private ImageView medal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        userAvatar = (ImageView) findViewById(R.id.report_user_iv);
        medal = (ImageView) findViewById(R.id.report_medal_iv);

        userAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReportActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        medal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ReportActivity.this);
                LayoutInflater factory = LayoutInflater.from(ReportActivity.this);
                final View mView= factory.inflate(R.layout.fragment_medal, null);
                builder.setView(mView)
                        .setNegativeButton("Dismiss", null);
                builder.show();
            }
        });
    }
}
