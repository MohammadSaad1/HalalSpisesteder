package com.example.halalspisesteder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.halalspisesteder.Firebase.FirebaseFunctions;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    EditText Email, Password;
    final Activity activity = this;
    final FirebaseFunctions firebaseFunctions = new FirebaseFunctions();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         loginButton = findViewById(R.id.btn_Login);
         Email = findViewById(R.id.et_EmailAdress);
         Password = findViewById(R.id.et_Password);

loginButton.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v) {
        firebaseFunctions.SignIn(Email.getText().toString(), Password.getText().toString(), activity );
    }
});



    }
}
