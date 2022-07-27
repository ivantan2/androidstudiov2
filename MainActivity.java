package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itis.libs.parserng.android.expressParser.MathExpression;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void test1 (View view){
        Button one = (Button) findViewById(view.getId());
        EditText Enternum = (EditText) findViewById(R.id.Enternum);
        String var1 = one.getText().toString();
        String var2 = Enternum.getText().toString();
        Enternum.setText(var2 + var1);



    }

    public void typeEquals(View view) {
        EditText Enternum = (EditText) findViewById(R.id.Enternum);
        String var2 = Enternum.getText().toString();
        MathExpression expr = new MathExpression(var2);

        Enternum.setText(String.valueOf(expr.solve()));
    }

    public void Delete (View view){
        EditText Enternum = (EditText) findViewById(R.id.Enternum);
        String var2 = Enternum.getText().toString();
        int var3 = var2.length();
        if(var3 > 0){
            Enternum.setText(var2.substring(0, var3 - 1));
        }
    }
    public void Clear (View view){
        EditText Enternum = (EditText) findViewById(R.id.Enternum);
        Enternum.setText("");
    }



}