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

public class weight extends AppCompatActivity {
    String[] from = {"","MILLIGRAM","GRAM","KILOGRAM","LITRE","MILLILITRE","KILOLITRE","TONNES","POUNDS","OUNCES"};
    String[] to ={"","MILLIGRAM","GRAM","KILOGRAM","LITRE","MILLILITRE","KILOLITRE","TONNES","POUNDS","OUNCES"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        EditText et=(EditText) findViewById(R.id.val);
        Spinner spin1 = (Spinner) findViewById(R.id.spinner);
        Spinner spin2= (Spinner) findViewById(R.id.spinne);
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
                Button cal=(Button) findViewById(R.id.cal);
                cal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Spinner spin1 = (Spinner) findViewById(R.id.spinner);
                        Spinner spin2 = (Spinner) findViewById(R.id.spinne);
                        EditText et = (EditText) findViewById(R.id.val);
                        TextView out = (TextView) findViewById(R.id.out);
                        if (spin1.getSelectedItem().equals(spin2.getSelectedItem())) {
                            if (!et.getText().toString().equals("")) {
                                out.setText(et.getText());
                            }
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLIGRAM")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            milligram f = new milligram(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("GRAM")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            gram f = new gram(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOGRAM")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilogram f = new kilogram(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("MILLILITRE")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            millilitre f = new millilitre(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("LITRE")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            litre f = new litre(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("KILOLITRE")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            kilolitre f = new kilolitre(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.pounds());
                        }
                        if ((spin1.getSelectedItem().toString().equals("TONNES")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            tonne f = new tonne(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("POUNDS")) && (spin2.getSelectedItem().toString().equals("OUNCES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            pounds f = new pounds(num);
                            out.setText("The result is" + f.ounce());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("MILLILITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.millilitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("LITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.litre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("KILOLITRE"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.kilolitre());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("GRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.gram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("MILLIGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.milligram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("KILOGRAM"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.kilogram());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("TONNES"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.tonne());
                        }
                        if ((spin1.getSelectedItem().toString().equals("OUNCES")) && (spin2.getSelectedItem().toString().equals("POUNDS"))) {
                            Double num = Double.valueOf(et.getText().toString());
                            ounce f = new ounce(num);
                            out.setText("The result is" + f.pounds());
                        }
                    }
                });       }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        }
}
