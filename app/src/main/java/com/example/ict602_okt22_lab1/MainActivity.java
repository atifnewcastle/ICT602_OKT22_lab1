package com.example.ict602_okt22_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);

    }

    public void displayText(View view){

        String text = etName.getText().toString();
        tvMessage.setText("Welcome!" + text);

        Toast toast = Toast.makeText(this, "HI! welcome bro"+ count++, Toast.LENGTH_SHORT);
        toast.show();
    }
}