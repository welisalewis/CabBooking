package com.example.admin.book_o_cab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DriverActivity extends AppCompatActivity {
  private EditText mEmail,mPassword;
    private Button mLogin,mRegistration;

    private FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListner FirebaseAuthListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver);

        mEmail=(EditText) findViewById(R.id.email);
        mPassword=(EditText) findViewById(R.id.password);

        mLogin=(Button) findViewById(R.id.login);
        mRegistration =(Button)findViewById(R.id.registration);
    }
}
