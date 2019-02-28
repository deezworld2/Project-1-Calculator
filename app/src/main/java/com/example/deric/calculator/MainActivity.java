package com.example.deric.calculator;
/* There is a lot of redundant code in this program. I am aware. I wrote blocks of code and copied
and pasted them where applicable. I was too lazy to go back and fix all of the redundancies.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.widget.*;
import android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private double memory = 0.0;
    private double temp = 0.0;
    private boolean opPerformed = false;
    private Stack<String> operators = new Stack<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zeroClicked(View v){
        TextView t = findViewById(R.id.outputView);
        if (!String.valueOf(t.getText()).equals("0") && !opPerformed)
        {
            t.setText(t.getText() + "0");
            temp = Double.parseDouble(String.valueOf(t.getText()));
        }else if (opPerformed){
            t.setText("0");
        }
        opPerformed = false;
    }
    public void oneClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("1");
        }else{
            t.setText(t.getText() + "1");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void twoClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("2");
        }else{
            t.setText(t.getText() + "2");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void threeClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("3");
        }else{
            t.setText(t.getText() + "3");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void fourClicked(View v){
        TextView t = findViewById(R.id.outputView);

        String testString = String.valueOf(temp);
        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("4");
        }else{
            t.setText(t.getText() + "4");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void fiveClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("5");
        }else{
            t.setText(t.getText() + "5");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void sixClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("6");
        }else{
            t.setText(t.getText() + "6");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void sevenClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("7");
        }else{
            t.setText(t.getText() + "7");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void eightClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("8");
        }else{
            t.setText(t.getText() + "8");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void nineClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (t.getText().equals("0") || t.getText().equals("") || opPerformed){
            t.setText("9");

        }else{
            t.setText(t.getText() + "9");
        }
        temp = Double.parseDouble(String.valueOf(t.getText()));
        opPerformed = false;
    }
    public void addClicked(View v){
    TextView t = findViewById(R.id.outputView);
    TextView mem = findViewById(R.id.testView);

    opPerformed = true;
    if (operators.empty()){
        operators.push("+");
        memory = temp;
        t.setText("0");
        if (String.valueOf(memory).endsWith(".0"))
        {
            mem.setText(String.valueOf((int) memory));
        }else{
            mem.setText(String.valueOf(memory));
        }
    }else{
        if (operators.peek() == "+")
        {
            temp = memory + temp;
            operators.pop();
            if (String.valueOf(temp).endsWith(".0")){
                t.setText(String.valueOf((int) temp));

            }else{
                t.setText(String.valueOf(temp));
            }
        }
        else if (operators.peek() == "-")
        {
            temp = memory - temp;
            operators.pop();
            if (String.valueOf(temp).endsWith(".0")){
                t.setText(String.valueOf((int) temp));

            }else{
                t.setText(String.valueOf(temp));
            }
        }
        else if (operators.peek() == "/")
        {
            if (temp == 0.0){
                t.setText("Divide by 0 error");
            }else{
                temp = memory/temp;
            }
            operators.pop();
            if (String.valueOf(temp).endsWith(".0")){
                t.setText(String.valueOf((int) temp));

            }else{
                t.setText(String.valueOf(temp));
            }
        }
        else if (operators.peek() == "x")
        {
            temp = memory*temp;
            operators.pop();
            if (String.valueOf(temp).endsWith(".0")){
                t.setText(String.valueOf((int) temp));

            }else{
                t.setText(String.valueOf(temp));
            }
        }
    }
    }
    public void subClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        opPerformed = true;
        if (operators.empty()){
            operators.push("-");
            memory = temp;
            t.setText("0");
            if (String.valueOf(memory).endsWith(".0"))
            {
                mem.setText(String.valueOf((int) memory));
            }else{
                mem.setText(String.valueOf(memory));
            }        }else{
            if (operators.peek() == "+")
            {
                temp = memory + temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "-")
            {
                temp = memory - temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "/")
            {
                if (temp == 0.0){
                    t.setText("Divide by 0 error");
                }else{
                    temp = memory/temp;
                }
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "x")
            {
                temp = memory*temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
        }
    }
    public void divClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        opPerformed = true;
        if (operators.empty()){
            operators.push("/");
            memory = temp;
            t.setText("0");
            if (String.valueOf(memory).endsWith(".0"))
            {
                mem.setText(String.valueOf((int) memory));
            }else{
                mem.setText(String.valueOf(memory));
            }
        }else{
            if (operators.peek() == "+")
            {
                temp = memory + temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "-")
            {
                temp = memory - temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "/")
            {
                if (temp == 0.0){
                    t.setText("Divide by 0 error");
                }else{
                    temp = memory/temp;
                }
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "x")
            {
                temp = memory*temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
        }
    }
    public void multiClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        opPerformed = true;
        if (operators.empty()){
            operators.push("x");
            memory = temp;
            t.setText("0");
            if (String.valueOf(memory).endsWith(".0"))
            {
                mem.setText(String.valueOf((int) memory));
            }else{
                mem.setText(String.valueOf(memory));
            }
        }else{
            if (operators.peek() == "+")
            {
                temp = memory + temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "-")
            {
                temp = memory - temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "/")
            {
                if (temp == 0.0){
                    t.setText("Divide by 0 error");
                }else{
                    temp = memory/temp;
                }
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "x")
            {
                temp = memory*temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
        }
    }
    public void percentClicked(View v) {
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        double percent = 0.0;
        percent = temp/100.0;

        if (operators.empty()) {
            t.setText("0");
            if (String.valueOf(memory).endsWith(".0") && memory != 0.0) {
                mem.setText(String.valueOf((int) memory));
            } else if (memory == 0.0) {
                mem.setText("");
            } else {
                mem.setText(String.valueOf(memory));
            }
        } else {
            if (operators.peek() == "+") {
                temp = memory + (memory * percent);
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")) {
                    t.setText(String.valueOf((int) temp));

                } else {
                    t.setText(String.valueOf(temp));
                }
            } else if (operators.peek() == "-") {
                temp = memory - (memory * percent);
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")) {
                    t.setText(String.valueOf((int) temp));

                } else {
                    t.setText(String.valueOf(temp));
                }
            } else if (operators.peek() == "/") {
                if (temp == 0.0) {
                    t.setText("Divide by 0 error");
                } else {
                    temp = memory / percent;
                }
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")) {
                    t.setText(String.valueOf((int) temp));

                } else {
                    t.setText(String.valueOf(temp));
                }
            } else if (operators.peek() == "x") {
                temp = memory * percent;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")) {
                    t.setText(String.valueOf((int) temp));

                } else {
                    t.setText(String.valueOf(temp));
                }
            }

        }
    }
    public void sqrtClicked(View v){
        TextView t = findViewById(R.id.outputView);

        opPerformed = true;
        temp = Math.sqrt(temp);
        if (String.valueOf(temp).endsWith(".0")){
            t.setText(String.valueOf((int) temp));
        }else{
            t.setText(String.valueOf(temp));
        }

    }
    public void decimalClicked(View v){
        TextView t = findViewById(R.id.outputView);

        if (!String.valueOf(t.getText()).contains(".")){
            t.setText(String.valueOf(t.getText()) + ".");
        }
    }
    public void clearClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        memory = 0.0;
        temp = 0.0;
        operators.clear();
        t.setText("0");
        mem.setText("");

    }
    public void equalsClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        opPerformed = true;

        if (operators.empty()){
            memory = temp;
            if (String.valueOf(temp).endsWith(".0"))
            {
                t.setText(String.valueOf((int) temp));
            }else{
                t.setText(String.valueOf(temp));
            }
        }else{
            if (operators.peek() == "+")
            {
                temp = memory + temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "-")
            {
                temp = memory - temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "/")
            {
                if (temp == 0.0){
                    t.setText("Divide by 0 error");
                }else{
                    temp = memory/temp;
                }
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            else if (operators.peek() == "x")
            {
                temp = memory*temp;
                operators.pop();
                if (String.valueOf(temp).endsWith(".0")){
                    t.setText(String.valueOf((int) temp));

                }else{
                    t.setText(String.valueOf(temp));
                }
            }
            mem.setText("");
        }

    }

    public void plusMinusClicked(View v){
        TextView t = findViewById(R.id.outputView);
        TextView mem = findViewById(R.id.testView);

        if (String.valueOf(t.getText()).contains("-"))
        {
            t.setText(String.valueOf(t.getText()).substring(1));
        }else{
            String reverse = "-" + String.valueOf(t.getText());
            t.setText(String.valueOf(reverse));
        }
    }
}
