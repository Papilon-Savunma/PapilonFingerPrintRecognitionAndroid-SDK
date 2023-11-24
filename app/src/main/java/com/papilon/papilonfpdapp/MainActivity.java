package com.papilon.papilonfpdapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.papilon.papilonfinger.view.pap_DetectorActivity;

public class MainActivity extends AppCompatActivity {
    Button openSdkButton;
    TextView textView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSdkButton = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        openSdkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startLibraryActivity();
            }
        });
    }

    public void startLibraryActivity() {
        Intent intent = new Intent(MainActivity.this, pap_DetectorActivity.class);
        intent.putExtra("calling_package", this.getPackageName());
        intent.putExtra("calling_class", this.getClass().getName());
        intent.putExtra("from_main", "true");

        // license parameters
        intent.putExtra("token_for_license", "");
        intent.putExtra("license_id", "");
        // ----------------------------------------------------------------

        startActivity(intent);
    }
}

