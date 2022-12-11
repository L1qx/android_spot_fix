package com.example.nrsv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegistrationActivityNrsv extends AppCompatActivity {

    TextView acctexist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_nrsv);

        acctexist=findViewById(R.id.loginexist);

        acctexist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(RegistrationActivityNrsv.this,Login.class);
                startActivity(i);
                finish();
            }
        });



    }

}