package com.semenov.reversepolishnotation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    String str="0";
    int sh =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clik1(View view){
        if(sh==0) str="1";
        else
            str+=1;
        sh++;
        OnClik();
    }
    public void clik2(View view){
        if(sh==0) str="2";
        else
            str+=2;
        sh++;
        OnClik();
    }
    public void clik3(View view){
        if(sh==0) str="3";
        else
            str+=3;
        sh++;
        OnClik();
    }
    public void clik4(View view){
        if(sh==0) str="4";
        else
            str+=4;
        sh++;
        OnClik();
    }
    public void clik5(View view){
        if(sh==0) str="5";
        else
            str+=5;
        sh++;
        OnClik();
    }
    public void clik6(View view){
        if(sh==0) str="6";
        else
            str+=6;
        sh++;
        OnClik();
    }
    public void clik7(View view){
        if(sh==0) str="7";
        else
            str+=7;
        sh++;
        OnClik();
    }
    public void clik8(View view){
        if(sh==0) str="8";
        else
            str+=8;
        sh++;
        OnClik();
    }
    public void clik9(View view){
        if(sh==0) str="9";
        else
            str+=9;
        sh++;
        OnClik();
    }
    public void clik0(View view){
        if(sh==0) str="0";
        else
            str+=0;
        sh++;
        OnClik();
    }

    //Методы кнопок математических знаков:

    public void clikPlus(View view){
        if(sh==0) str="+";
        else
            str+="+";
        sh++;
        OnClik();
    }
    public void clik1Minus(View view){
        if(sh==0) str="-";
        else
            str+="-";
        sh++;
        OnClik();
    }
    public void clik1Multiplication(View view){
        if(sh==0) str="*";
        else
            str+="*";
        sh++;
        OnClik();
    }
    public void clik1Division(View view){
        if(sh==0) str="/";
        else
            str+="/";
        sh++;
        OnClik();

    }

    //меод кнопки "." для дробных чисел

    public void clik1Point(View view){
        if(sh==0) str="";
        else
            str+=".";
        sh++;
        OnClik();

    }

    public void clikOpeningBracket(View view){ // открывающая скобка
        if(sh==0) str="";
        else
            str+="(";
        sh++;
        OnClik();

    }

  public void clikClosingBracket(View view){ // закрываающая скобка
        if(sh==0) str="";
        else
            str+=")";
        sh++;
        OnClik();

    }

    public void clik1C(View view){ //сброс
        str="0";
        sh=0;

        OnClik();
    }

    public void delete(View view){ //стереть часть строки
        char [] temp = this.str.toCharArray();
        ArrayList list = new ArrayList();
        for (int i = 0;i<temp.length;i++){
            list.add(temp[i]);
        }
        list.remove(temp.length-1);
        this.str="";
        for (int i = 0;i<list.size();i++){
            this.str += ""+ list.get(i);
        }
        sh--;

        OnClik();
    }



    private void display(String number) { //Передача текста в текстовую панель
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("" + number);
    }

    private void display(double number) { //Передача текста в текстовую панель
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("" + number);
    }

    public void OnClik(){
        display(str);
    }

    public void clikEqually(View view) {
    display(new ReversePolishNotation().decide(str));
       // OnClik();
    }
}
