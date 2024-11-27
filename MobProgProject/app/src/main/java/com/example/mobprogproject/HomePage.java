package com.example.mobprogproject;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.IOException;
import java.io.InputStream;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView splashImage = findViewById(R.id.ic);

        AssetManager assetManager = getAssets();
        try {
            InputStream inputStream = assetManager.open("img.png");
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            splashImage.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Button buttonNutrition = findViewById(R.id.nutrition);
        buttonNutrition.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, MainActivity.class);
            startActivity(intent);
        });

        Button buttonBMI = findViewById(R.id.BMI);
        buttonBMI.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, BMIPage.class);
            startActivity(intent);
        });

        ImageView buttonProfile = findViewById(R.id.userPP);
        buttonProfile.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, ProfilePage.class);
            startActivity(intent);
        });
    }
}