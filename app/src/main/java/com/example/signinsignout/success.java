package com.example.signinsignout;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class success extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        Bundle b=getIntent().getExtras();

        Intent intent = getIntent();
        String str1 = b.getString("name");
        String str2 = b.getString("dob");
        String str3 = b.getString("usn");
        String str4 = b.getString("email");

        TextView receiver_name=findViewById(R.id.receive_name);
        receiver_name.setText("User Name :"+str1+"\n"+"DOB :"+str2+"\n"+"USN :"+str3+"\n"+"Email"+ str4);
    }
}