package com.example.signinsignout;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        username=findViewById(R.id.uid);
        password=findViewById(R.id.pwd);

    }

    public void signIn(View v)
    {
        Bundle b=getIntent().getExtras();
        String uname=b.getString("uid");
        String passwd=b.getString("password");
        if(username.getText().toString().equals(uname) && password.getText().toString().equals(passwd))
        {
            Toast.makeText(this, "Sign In Successful", Toast.LENGTH_LONG).show();
            Intent i=new Intent(this,success.class);

            i.putExtras(b);
            startActivity(i);

        }
        else
        {
            Toast.makeText(this, "Sign In Unsuccessful", Toast.LENGTH_LONG).show();
        }

    }
}