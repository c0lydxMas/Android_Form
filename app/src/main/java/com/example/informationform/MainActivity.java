package com.example.informationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText full_name = (EditText) findViewById(R.id.fullname);
    EditText student_Id = (EditText) findViewById(R.id.student_id);
    EditText dob = (EditText) findViewById(R.id.dob);
    EditText phone = (EditText) findViewById(R.id.phone);
    EditText email = (EditText) findViewById(R.id.email);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitHandler(View view) {
        String fullName = full_name.getText().toString();
        String studentId = student_Id.getText().toString();
        String dateOfBirth = dob.getText().toString();
        String phoneNumber = phone.getText().toString();
        String emailAddress = email.getText().toString();

        if (fullName.matches("") || studentId.matches("") || dateOfBirth.matches("") || phoneNumber.matches("") || emailAddress.matches("")  ) {
            Toast.makeText(this, "Xin vui long dien thong tin vao tat ca nhung truong bat buoc", Toast.LENGTH_SHORT).show();
            return;
        }
    }

}