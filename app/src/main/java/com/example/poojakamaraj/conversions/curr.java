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

public class curr extends AppCompatActivity {
    String[] from = {"", "US_DOLLAR","RUPEES","EURO","SG_DOLLAR","YEN","POUND","SWISS_FRANC","PESO"};
    String[] to = {"", "US_DOLLAR","RUPEES","EURO","SG_DOLLAR","YEN","POUND","SWISS_FRANC","PESO"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curr);
        EditText et=(EditText) findViewById(R.id.val);
        Spinner spin1 = (Spinner) findViewById(R.id.sp5);
        Spinner spin2= (Spinner) findViewById(R.id.sp6);
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
              Button cal=(Button) findViewById(R.id.cal);
              cal.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      Spinner spin1 = (Spinner) findViewById(R.id.sp5);
                      Spinner spin2= (Spinner) findViewById(R.id.sp6);
                      EditText et=(EditText) findViewById(R.id.val);
                      TextView out=(TextView) findViewById(R.id.out);
                      if(spin1.getSelectedItem().equals(spin2.getSelectedItem()))
                      {
                          if(!et.getText().toString().equals(""))
                          {
                              out.setText(et.getText());
                          }
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("US_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          us_dollar f= new us_dollar(num);
                          out.setText("The result is"+f.peso());
                      }

                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("RUPEES"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          rupees f= new rupees(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("EURO"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          euro f= new euro(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SG_DOLLAR"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          sg_dollar f= new sg_dollar(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("YEN"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          yen f= new yen(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                      else if((spin1.getSelectedItem().toString().equals("POUND"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          pound f= new pound(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("SWISS_FRANC"))&&(spin2.getSelectedItem().toString().equals("PESO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          swiss_franc f= new swiss_franc(num);
                          out.setText("The result is"+f.peso());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("US_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.us_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("RUPEES")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.rupees());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("SG_DOLLAR")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.sg_dollar());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("EURO")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.euro());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("YEN")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.yen());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("POUND")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.pound());
                      }
                      else if((spin1.getSelectedItem().toString().equals("PESO"))&&(spin2.getSelectedItem().toString().equals("SWISS_FRANC")))
                      {
                          Double num=Double.valueOf(et.getText().toString());
                          peso f= new peso(num);
                          out.setText("The result is"+f.swiss_franc());
                      }
                  }
              });

          }
      });
    }
}
