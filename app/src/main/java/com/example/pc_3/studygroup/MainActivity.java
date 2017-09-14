package com.example.pc_3.studygroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkUI();
        init();
    }

    private void init() {
        findViewById(R.id.btnValidate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = etPassword.getText().toString();
                if (validatePassword(password))
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_LONG).show();
                else Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void linkUI() {
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    boolean validatePassword(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasNumber = password.matches(".*\\d+.*");
        boolean isAtLeast8 = password.length() >= 8;
        boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
        return (hasLowercase && hasUppercase && isAtLeast8 && hasSpecial);
    }

    boolean validatePasswordWithNumber(String password) {
        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasNumber = password.matches(".*\\d+.*");
        boolean isAtLeast8 = password.length() >= 8;
        boolean hasSpecial = !password.matches("[A-Za-z0-9 ]*");
        return (hasLowercase && hasUppercase && isAtLeast8 && hasNumber);
    }
    boolean hasUpperCase(String password){
        return !password.equals(password.toUpperCase());
    }

    boolean isAtLeast8(String password){
        return password.length() >= 8;
    }

    boolean hasNumber(String password){
        return password.matches(".*\\d+.*");
    }

}
