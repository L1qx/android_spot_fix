package com.example.nrsv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    EditText user,pass;
    TextView signup;
    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user=findViewById(R.id.userlogin);
        pass=findViewById(R.id.passlogin);

       signin=findViewById(R.id.signinlogin);

        signup=findViewById(R.id.buttonsignup);

          signup.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

               Intent i=new Intent(Login.this,RegistrationActivityNrsv.class);
        startActivity(i);
        finish();
            }
      });

    }


}