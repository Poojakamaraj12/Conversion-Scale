package com.example.poojakamaraj.conversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class temp extends AppCompatActivity  {
    String[] from = {"", "FAHRENHEIT", "CELSIUS","KELVIN"};
    String[] to = {"", "FAHRENHEIT", "CELSIUS","KELVIN"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);
        EditText et=(EditText) findViewById(R.id.editText);
        TextView out=(TextView) findViewById(R.id.textView);
        Spinner spin1 = (Spinner) findViewById(R.id.sp1);
        Spinner spin2= (Spinner) findViewById(R.id.sp2);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, from);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);
        ArrayAdapter adapters = new ArrayAdapter(this, android.R.layout.simple_spinner_item, to);
        adapters.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapters);
    et.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        Button cal=(Button) findViewById(R.id.button6);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spin1 = (Spinner) findViewById(R.id.sp1);
                Spinner spin2= (Spinner) findViewById(R.id.sp2);
                EditText et=(EditText) findViewById(R.id.editText);
                TextView out=(TextView) findViewById(R.id.textView);
                if(spin1.getSelectedItem().equals(spin2.getSelectedItem()))
    {
     if(!et.getText().toString().equals(""))
     {
         out.setText(et.getText());
     }
    }
 if((spin1.getSelectedItem().toString().equals("FAHRENHEIT"))&&(spin2.getSelectedItem().toString().equals("CELSIUS")))
 {
     Double num=Double.valueOf(et.getText().toString());
     fahrenheit f= new fahrenheit(num);
     out.setText("The result is"+f.toc());

 }
        if((spin1.getSelectedItem().toString().equals("FAHRENHEIT"))&&(spin2.getSelectedItem().toString().equals("KELVIN")))
        {
            Double num=Double.valueOf(et.getText().toString());
            fahrenheit f= new fahrenheit(num);
            out.setText("The result is"+f.tok());
        }

                if((spin1.getSelectedItem().toString().equals("CELSIUS"))&&(spin2.getSelectedItem().toString().equals("FAHRENHEIT")))
        {
            Double num=Double.valueOf(et.getText().toString());
            celsius f= new celsius(num);
            out.setText("The result is"+f.tof());
        }
        if((spin1.getSelectedItem().toString().equals("CELSIUS"))&&(spin2.getSelectedItem().toString().equals("KELVIN"))) {
            Double num = Double.valueOf(et.getText().toString());
            celsius f = new celsius(num);
            out.setText("The result is" + f.tok());
        }
        if((spin1.getSelectedItem().toString().equals("KELVIN"))&&(spin2.getSelectedItem().toString().equals("CELSIUS")))
        {
            Double num=Double.valueOf(et.getText().toString());
            kelvin f= new kelvin(num);
            out.setText("The result is"+f.toc());
        }
        if((spin1.getSelectedItem().toString().equals("KELVIN"))&&(spin2.getSelectedItem().toString().equals("FAHRENHEIT")))
        {
            Double num=Double.valueOf(et.getText().toString());
            kelvin f= new kelvin(num);
            out.setText("The result is"+f.tof());
        }

    }
});
    }
    });
    }

}
