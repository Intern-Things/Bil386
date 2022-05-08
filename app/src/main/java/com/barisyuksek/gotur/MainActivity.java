package com.barisyuksek.gotur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister, btnLogin, btnForgotPass;

    public String CustomerNum[] = {"5000000000","5000000001","5000000002","5000000003",};
    public String CustomerPass[] = {"0000","0001","0002","0003",};



    public void init(){

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister= (Button) findViewById(R.id.btnRegister);
        btnForgotPass= (Button) findViewById(R.id.btnForgotPassword);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegister = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intentRegister);
            }
        });

        btnForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intentRegister = new Intent(MainActivity.this,ForgotPasswordActivity.class);
                startActivity(intentRegister);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean isLogin = false;
                EditText username = (EditText)findViewById(R.id.txtPhoneNum);
                EditText password = (EditText) findViewById(R.id.PasswordText);

                for(int i=0;i<CustomerNum.length;i++){
                    if(username.getText().toString().equals(CustomerNum[i].toString()) && password.getText().toString().equals(CustomerPass[i].toString())){
                        Intent intentLogin = new Intent(MainActivity.this,LoginActivity.class);
                        startActivity(intentLogin);
                        isLogin=true;
                        finish();
                    }
                }
                if(isLogin==false){
                    Toast.makeText(MainActivity.this,"Giriş Başarısız.",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}