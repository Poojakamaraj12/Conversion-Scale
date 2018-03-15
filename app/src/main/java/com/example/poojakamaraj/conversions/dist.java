package com.example.poojakamaraj.conversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class dist extends AppCompatActivity {
    String[] from = {"", "KILOMETRE", "METRE","CENTIMETRE","MILLIMETRE","MICROMETRE","NANOMETRE","MILE","YARD","FOOT","INCH"};
    String[] to = {"", "KILOMETRE", "METRE","CENTIMETRE","MILLIMETRE","MICROMETRE","NANOMETRE","MILE","YARD","FOOT","INCH"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dist);
        EditText et=(EditText) findViewById(R.id.val);
        Spinner spin1 = (Spinner) findViewById(R.id.sp3);
        Spinner spin2 = (Spinner) findViewById(R.id.sp4);
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
                        Spinner spin1 = (Spinner) findViewById(R.id.sp3);
                        Spinner spin2 = (Spinner) findViewById(R.id.sp4);
                        EditText et = (EditText) findViewById(R.id.val);
                        TextView out = (TextView) findViewById(R.id.out);
                        if (spin1.getSelectedItem().equals(spin2.getSelectedItem())) {
                            if (!et.getText().toString().equals("")) {
                                out.setText(et.getText());
                            }
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOMETRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilometres f = new kilometres(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("METRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            metre f = new metre(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIMETRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millimetre f = new millimetre(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("CENTIMETRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            centimetre f = new centimetre(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MICROMETRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            micrometre f = new micrometre(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("NANOMETRE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            nanometre f = new nanometre(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILE")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            mile f = new mile(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.inch());
                        }
                        if ((spin1.getSelectedItem().toString().equals("YARD")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            yard f = new yard(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("INCH")) && (spin2.getSelectedItem().toString().equals("FOOT"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            inch f = new inch(num);
                            out.setText("The result is" + f.foot());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("KILOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.kilometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("METRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.metre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("CENTIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.centimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("MILLIMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.millimetre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("MICROMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.micrometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("NANOMETRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.nanometre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("MILE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.mile());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("YARD"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.yard());
                        }
                        if ((spin1.getSelectedItem().toString().equals("FOOT")) && (spin2.getSelectedItem().toString().equals("INCH"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            foot f = new foot(num);
                            out.setText("The result is" + f.inch());
                        }
                    }
                });
            }
        });
    }
}