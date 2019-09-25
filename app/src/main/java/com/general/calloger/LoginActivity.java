package com.general.calloger;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputLayout textInputEmail;
    private TextInputLayout textInputPassword;
    private ImageView imageView;
    private Button googleButton;
    private Drawable logoDrawable;
    private Drawable googleDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logoDrawable = getResources().getDrawable(R.drawable.referralix4);
        int go = R.drawable.google_icon2;

        imageView = findViewById(R.id.logoImageView);
        imageView.setImageDrawable(logoDrawable);
        googleButton = findViewById(R.id.gmail_login);
        googleButton.setCompoundDrawablesWithIntrinsicBounds(go, 0 , 0,0);
        textInputEmail = findViewById(R.id.text_input_email);
        textInputPassword = findViewById(R.id.text_input_password);
    }

    private boolean validateEmail() {
        String emailInput = textInputEmail.getEditText().getText().toString().trim();
        if(emailInput.isEmpty()) {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else{ //overenie na databaze treba
            textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword() {
        String passwordInput = textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty()) {
            textInputPassword.setError("Field can't be empty");
            return false;
        } else{
            textInputPassword.setError(null);
            return true;
        }
    }

    public void login(View v) {
        return;
    }
}
