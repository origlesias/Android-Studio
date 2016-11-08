package com.example.oriol.calcul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void onClick(View view){
        EditText et= (EditText) findViewById(R.id.TxtEntrada);
        String str= "id" + view.getId();
        int resId= getResources().getIdentifier(str,"string",getPackageName());
        et.setText(getString(resId));
    }


}
