package com.example.informationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText full_name;
    private EditText student_Id;
    private EditText dob;
    private EditText phone;
    private EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        full_name = findViewById(R.id.fullname);
        student_Id = findViewById(R.id.student_id);
        dob = findViewById(R.id.dob);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);

    }

    public void submitHandler(View view) {
        String fullName = full_name.getText().toString();
        String studentId = student_Id.getText().toString();
        String dateOfBirth = dob.getText().toString();
        String phoneNumber = phone.getText().toString();
        String emailAddress = email.getText().toString();

        if (fullName.matches("") || studentId.matches("") || dateOfBirth.matches("") || phoneNumber.matches("") || emailAddress.matches("")) {
            Toast.makeText(this, "Xin vui long dien thong tin vao tat ca nhung truong bat buoc", Toast.LENGTH_SHORT).show();
        }
    }

}