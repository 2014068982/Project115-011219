package com.example.mclorenz.project115;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    private EditText editTextLast;
    private EditText editTextFirst;
    private EditText editTextNum;
    private EditText editTextMail;
    private Button btnConfirm;
   // String stLast, stFirst, stMail;
   // int stNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_screen);

/*        editTextLast = findViewById(R.id.etLast);
        editTextFirst = findViewById(R.id.etFirst);
        editTextNum = findViewById(R.id.etNum);
        editTextMail = findViewById(R.id.etMail);*/
       btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FourthActivity.this, FifthActivity.class);
                FourthActivity.this.startActivity(myIntent);
            }
        });
//        btnConfirm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(FourthActivity.this,FifthActivity.class);
////                stLast=editTextLast.getText().toString();
////                stFirst=editTextFirst.getText().toString();
////                int num=Integer.parseInt(editTextNum.getText().toString());
////                stMail=editTextMail.getText().toString();
////                intent.putExtra("Value",stLast);
////                intent.putExtra("Value1",stFirst);
////                intent.putExtra("Value2",stNum);
////                intent.putExtra("Value3",stMail);
//                startActivity(intent);
////                finish();
//            }
//        });
/*
        editTextLast.addTextChangedListener(confirmTextWatcher);
        editTextFirst.addTextChangedListener(confirmTextWatcher);
        editTextNum.addTextChangedListener(confirmTextWatcher);
        editTextMail.addTextChangedListener(confirmTextWatcher);*/
    }

  /*  public void openFifth(){
        Intent intent = new Intent(this,FifthActivity.class);
        startActivity(intent);
    }

 /*   private TextWatcher confirmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
*/
  /*      @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String lastInput = editTextLast.getText().toString().trim();
            String firstInput = editTextFirst.getText().toString().trim();
            String numInput = editTextNum.getText().toString().trim();
            String mailInput = editTextMail.getText().toString().trim();

            btnConfirm.setEnabled(!lastInput.isEmpty() && !firstInput.isEmpty() && !numInput.isEmpty() && !mailInput.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };*/
}