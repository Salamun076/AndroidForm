package com.salamun.formapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditText InputName = (EditText) findViewById(R.id.inputname);
        EditText InputEmail = (EditText) findViewById(R.id.inputemail);
        EditText InputNumber = (EditText) findViewById(R.id.inputnumber);
        EditText InputPassword = (EditText) findViewById(R.id.inputpassword);

        Button btnSave = (Button) findViewById(R.id.simpandata);
        btnSave.setOnClickListener(new View.OnlickListener(){
            @Override
            public void onClick(View){

                Log.d("--Nama--", inputname.getText().toString());
                Log.d("--Email--", inputemail.getText().toString());
                Log.d("--Handphone--", inputnumber.getText().toString());
                Log.d("--Password--", inputpassword.getText().toString());

            }
        }

    }
}
