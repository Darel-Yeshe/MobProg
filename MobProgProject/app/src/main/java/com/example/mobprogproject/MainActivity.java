package com.example.mobprogproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import Modul.Product;

public class MainActivity extends AppCompatActivity {

    private List<Product> products = new ArrayList<>();
    private RecyclerView rvProduct;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(v -> {
            finish();
        });

        rvProduct = findViewById(R.id.rv_product);
        rvProduct.setLayoutManager(new GridLayoutManager(this,2));

        products.add(new Product("AGus", "cat.png", "asep", "meat", "jantan + betina", "uhhh, 9 bulan?", "bercocok tanam", 14));
        products.add(new Product("AGus", "cat.png", "", "", "", "", "", 0));
        products.add(new Product("AGus", "cat.png", "", "", "", "", "", 0));
        products.add(new Product("AGus", "cat.png", "", "", "", "", "", 0));


        adapter = new ProductAdapter(this, products);
        rvProduct.setAdapter(adapter);
    }
}