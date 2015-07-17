package com.example.administrator.mcalculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    public String str = "";
    Character op = 'q';
    Double num, numtemp;
    EditText showsign;
    EditText showResult;
    boolean deci = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText) findViewById(R.id.et);
        showsign = (EditText)findViewById(R.id.sign);
    }

    public void btnDotClicked(View v) {
        if(deci == false){
            insert(".");
            deci = true;
        }
    }

    public void btn0Clicked(View v) {
        insert("0");
    }

    public void btn1Clicked(View v) {
        insert("1");
    }

    public void btn2Clicked(View v) {
        insert("2");
    }

    public void btn3Clicked(View v) {
        insert("3");
    }

    public void btn4Clicked(View v) {
        insert("4");
    }

    public void btn5Clicked(View v) {
        insert("5");
    }

    public void btn6Clicked(View v) {
        insert("6");
    }

    public void btn7Clicked(View v) {
        insert("7");
    }

    public void btn8Clicked(View v) {
        insert("8");
    }

    public void btn9Clicked(View v) {
        insert("9");
    }

    public void btnplusClicked(View v) {
        perform();
        showsign.setText("+");
        op = '+';
    }

    public void btnminusClicked(View v) {
        perform();
        showsign.setText("-");
        op = '-';
    }

    public void btndivideClicked(View v) {
        perform();
        showsign.setText("/");
        op = '/';
    }

    public void btnmultiClicked(View v) {
        perform();
        showsign.setText("*");
        op = '*';
    }

    public void btnequalClicked(View v) {
        calculate();
        showsign.setText("=");
    }

    public void btnclearClicked(View v) {
        reset();
        showsign.setText("");
    }

    public void btndeleteClicked(View v){
        dele();
    }

    public  void btnmenuClicked(View v){
        menu();
    }

    private void reset() {
        // TODO Auto-generated method stub
        str = "";
        op = 'q';
        num = 0.0;
        numtemp = 0.0;
        showResult.setText("");
        deci = false;
    }

    private void dele() {
        if (!str.equals(""))
        {
            if (str.length()==1)
                str="0";
            else{
                if(str.substring(str.length()-1).equals(".")){
                    deci = false;
                }
                str = str.substring(0,str.length()-1);
            }
            num = Double.valueOf(str).doubleValue();
            showResult.setText(str);
        }
    }


    private  void menu(){

    }

    private void insert(String j) {
        if(j.equals( ".")){
            if(str.equals( "")){
                str = str + "0.";
            }
            else{
                str = str + ".";
            }
        }
        else{
            if(str.equals("0")){
                str = j;
            }
            else{
                str = str + j;
            }
        }
        num = Double.valueOf(str).doubleValue();
        showResult.setText(str);
    }

    private void perform() {
        str = "";
        showResult.setText(str);
        deci=false;
        numtemp = num;
    }

    private void calculate() {
        if (op == '+')
            num = numtemp + num;
        else if (op == '-')
            num = numtemp - num;
        else if (op == '/')
            num = numtemp / num;
        else if (op == '*')
            num = numtemp * num;
        showResult.setText("" + num.floatValue());
        str="";
        deci=false;
    }
}