package com.example.addmakeover;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AddProductButtonClick(View view){
        Intent addProductIntent = new Intent(MainActivity.this, AddProduct.class);
        startActivity(addProductIntent);
    }
    public void ViewProductButtonClick(View view){
        Intent viewproduct = new Intent(MainActivity.this,ListProductActivity.class);
        startActivity(viewproduct);
    }

}
