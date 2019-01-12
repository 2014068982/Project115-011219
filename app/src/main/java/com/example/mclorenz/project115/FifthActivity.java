package com.example.mclorenz.project115;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class FifthActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button btnBook2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_screen);

/*        editTextLast = findViewById(R.id.etLast);
        editTextFirst = findViewById(R.id.etFirst);
        editTextNum = findViewById(R.id.etNum);
        editTextMail = findViewById(R.id.etMail);*/
        btnBook2 = findViewById(R.id.btnBook2);

        btnBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FifthActivity.this, LastActivity.class);
                FifthActivity.this.startActivity(myIntent);
            }
        });

 /*   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_screen);

        buttonBookAgain = (Button) findViewById(R.id.btnNext);
        buttonBookAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLast();
            }
        });
*/
        Spinner spinner = findViewById(R.id.spinPay);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.pay, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    public void openLast(){
        Intent intent = new Intent(this,LastActivity.class);
        startActivity(intent);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    }
