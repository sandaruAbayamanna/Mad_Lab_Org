package com.example.tute_02_temp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {
    //Declaring elements
    EditText et_temp;
    RadioButton rd_btn_C;
    RadioButton rd_btn_F;
    Button btn_calculate;
    TextView tv_ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign id to each an every element

        et_temp = findViewById(R.id.et_Temp);
        rd_btn_C = findViewById(R.id.rd_btn_C);
        rd_btn_F = findViewById(R.id.rd_btn_F);
        btn_calculate = findViewById(R.id.btn_Calculate);
        tv_ans = findViewById(R.id.tv_answer);


    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        btn_calculate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               calculateAnswer();
//            }
//        });
//    }

        public void calculateAnswer(View view) {
        Calculations cal= new Calculations();
        String value = et_temp.getText().toString();

        if(TextUtils.isEmpty(value)){
            Toast.makeText(this, "Enter the Temperature", Toast.LENGTH_SHORT).show();
        }else {
            Float temp = Float.parseFloat(value);
            if(rd_btn_F.isChecked()){
                temp = cal.convertFahrenheitToCelcius(temp);
            }else if(rd_btn_C.isChecked()){
                temp = cal.convertFahrenheitToCelcius(temp);
            }else{
                Toast.makeText(this, "Select a radio button", Toast.LENGTH_SHORT).show();
                temp = 0.00f;
            }
            tv_ans.setText(new Float(temp).toString());
            }
        }


}
