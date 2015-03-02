package com.example.nbeel_000.nbeel;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate  = (Button)findViewById(R.id.calculate);



       calculate.setOnClickListener(new Button.OnClickListener(){
           @Override
           public void onClick(View v) {
               EditText number1_EditT = (EditText) findViewById(R.id.number1);
               EditText number2_EditT = (EditText) findViewById(R.id.number2);
               EditText result_EditT = (EditText) findViewById(R.id.result);
               String x = number1_EditT.getText().toString();
               x = x.replaceAll(" ", "");
               String y = number2_EditT.getText().toString();
               y = y.replaceAll(" ", "");
               if (isNumber(x) && isNumber(y)) {
                   int number1 = Integer.parseInt(x);
                   int number2 = Integer.parseInt(y);
                   int result = number1 + number2;
                   result_EditT.setText(result + "");
               }
               else{
                   Toast.makeText(getBaseContext()," Insert wrong",Toast.LENGTH_LONG).show();
               }
           }
       });


    }

 public boolean isNumber(String x){
     boolean b = true;
    for (int i=0 ; i<x.length() ; i++){
        if(Character.isAlphabetic(x.charAt(i))){
            b=false;
        }
    }

 return b;
 }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
