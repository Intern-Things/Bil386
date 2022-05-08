package com.barisyuksek.gotur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductActivity extends AppCompatActivity {

    private Button btn;

    public void init(){
        btn = (Button) findViewById(R.id.button4);
        btn.setVisibility(View.VISIBLE);
        btn.setBackgroundColor(Color.TRANSPARENT);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(ProductActivity.this,FinalActivity.class);
                startActivity(intentRegister);
            }
        });
    }
}