package com.example.poojakamaraj.conversions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b4 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, temp.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, dist.class);
                startActivity(i2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(MainActivity.this, weight.class);
                startActivity(i4);
            }
        });
    }
}
    class conversion {
        double n;

        public void setval(double n) {
            this.n = n;
        }

        public double getval() {
            return n;
        }
    }

    class temperature extends conversion {
        double val;

        temperature() {
            conversion c = new conversion();
            c.setval(val);
            c.getval();
        }
    }

    class fahrenheit extends temperature {
        double n;
        temperature t = new temperature();

        fahrenheit(double n) {
            t.setval(n);
        }

        double toc() {
            return (t.getval() - 32) * 0.56;
        }

        double tok() {
            return (t.getval() + 459.67) * 0.56;
        }

      }

    class celsius extends temperature {
        double n;
        temperature t = new temperature();

        celsius(double n) {
            t.setval(n);
        }


        double tok() {
            return t.getval() + 273;
        }

        double tof() {
            return ((1.8) * t.getval()) + 32;
        }

    }

    class kelvin extends temperature {
        double n;
        temperature t = new temperature();

        kelvin(double n) {
            t.setval(n);
        }

        double toc() {
            return t.getval() - 273;
        }


        double tof() {
            return (t.getval() * 1.8) - 459.67;
        }

    }

/*class currency extends conversion
{
    double n;
    conversion c=new conversion();
currency()
{
    c.setval(n);
    c.getval();
}
}
class us_dollar extends currency
{
    us_dollar(double val){
        currency c=new currency();
    c.setval(val);
    }
    double rupees()
    {
        return 64.05*c.getval();
         }
    double euro() {return 0.84*c.getval();}
    double sg_dollar()
    {
        return 1.34*c.getval();
    }
    double yen()
    {
        return 113.31*c.getval();
    }
    double pound(){return 0.74*c.getval();}
    double swiss_franc(){return 0.98*c.getval();}
    double peso(){return 19.37*c.getval();}
}
class rupees extends currency
{
    rupees(double val){
        currency c=new currency();
        c.setval(val);}
    double us_dollar() {return 0.016*c.getval();}
    double euro() {return 0.013*c.getval();}
    double sg_dollar()
    {
        return 0.021*c.getval();
    }
    double yen() {return 1.77*c.getval();}
    double pound(){return 0.012*c.getval();}
    double swiss_franc(){return 0.015*c.getval();}
    double peso(){return 3.125*c.getval();}
    }
class euro extends currency {
    euro(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {
        return  75.95 * c.getval();
    }
    double us_dollar() {
        return 1.19 * c.getval();
    }
    double sg_dollar() {
        return  1.59 * c.getval();
    }
    double yen() {
        return 134.36 * c.getval();
    }
    double pound(){return 21.30*c.getval();}
    double swiss_franc(){return 1.17* c.getval();}
    double peso(){return 23.28*c.getval();}
    }
class sg_dollar extends currency {
    sg_dollar(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {
        return 47.70 * c.getval();
    }
    double us_dollar() {
        return 0.74 * c.getval();
    }
    double euro() {
        return  0.63 * c.getval();
    }
    double yen() {
        return 84.35 * c.getval();
    }
    double pound(){return 0.56*c.getval();}
    double swiss_franc(){return 0.74*c.getval();}
    double peso(){return 14.45*c.getval();}
    }
class yen extends currency {
    yen(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {
        return 0.57 * c.getval();
    }
    double us_dollar() {return 0.0088 * c.getval();}
    double sg_dollar() {return  0.012 * c.getval();}
    double euro() {
        return 0.0074 * c.getval();
    }
    double pound(){return 0.16*c.getval();}
    double swiss_franc(){return 0.0087*c.getval();}
    double peso(){return 0.17*c.getval();}
    }
class pound extends currency {
    pound(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {return 85.95 * c.getval();}
    double us_dollar() {return 1.36 * c.getval();}
    double sg_dollar() {return 1.80 * c.getval();}
    double euro() {return 1.13 * c.getval();}
    double yen(){return 153.44 * c.getval();}
    double swiss_franc(){return 1.32 * c.getval();}
    double peso(){return 26.02 * c.getval();}
    }
class swiss_franc extends currency {
    swiss_franc(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {return 64.90 * c.getval();}
    double us_dollar() {return 1.02 * c.getval();}
    double sg_dollar() {return 1.36 * c.getval();}
    double euro() {return 0.85 * c.getval();}
    double pound(){return 0.76 * c.getval();}
    double yen(){return 116.11 * c.getval();}
    double peso(){return 19.68 * c.getval();}
    }
class peso extends currency {
    peso(double val) {
        currency c = new currency();
        c.setval(val);
    }

    double rupees() {return 3.30 * c.getval();}
    double us_dollar() {return 0.052 * c.getval();}
    double sg_dollar() {return 0.069 * c.getval();}
    double euro() {return 0.043 * c.getval();}
    double pound(){return 0.92 * c.getval();}
    double swiss_franc(){return 0.05 * c.getval();}
    double yen(){return 5.90 * c.getval();}
    }
*/
class weights extends conversion
{
    double n;
    conversion c=new conversion();
    weights()
    {
        c.setval(n);
        c.getval();
    }
}
class milligram extends weights
{

    double convert;
    weights w=new weights();
    milligram(double val)
    {
         w.setval(val); }
    double gram()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(0.000001)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(0.000001)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.000000001)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(0.01)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.0000000009999999999)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(0.0000022046)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(0.005)*w.getval();
        return convert;
    }
}
class gram extends weights
{
    weights w=new weights();
    double convert;
    gram(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(1)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.000001)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.000001)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(0.0022046244)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(0.0352739907)*w.getval();
        return convert;
    }
}
class kilogram extends weights
{
    weights w=new weights();
    double convert;
    kilogram(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000000)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(1)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(2.2046244202)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(35.273990723)*w.getval();
        return convert;
    }
}
class litre extends weights
{
    weights w=new weights();
    double convert;
    litre(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000000)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(1)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.000982)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(2.20)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(33.814)*w.getval();
        return convert;
    }
}
class millilitre extends weights
{
    weights w=new weights();
    double convert;
    millilitre(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(0.001)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.000001)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.0000010)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(453.59)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(0.033814)*w.getval();
        return convert;
    }
}
class kilolitre extends weights
{
    weights w=new weights();
    double convert;
    kilolitre(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000000000)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(1000000)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(1000000)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(1.0183242 )*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(0.0083454042)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(33814)*w.getval();
        return convert;
    }
}
class tonne extends weights
{
    weights w=new weights();
    double convert;
    tonne(double val){ w.setval(val); }
    double milligram()
    {
        convert=(1000000000)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(1000000)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(0.000982)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(0.0000010)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(1000)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(1.0183242)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(2204.62244202)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(35273.990723)*w.getval();
        return convert;
    }
}
class pounds extends weights
{
    weights w=new weights();
    double convert;
    pounds(double val){ w.setval(val); }
    double milligram()
    {
        convert=(453592)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(453.592)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(0.000982)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(453.59)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(0.453592)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.000453592)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(0.0083454042)*w.getval();
        return convert;
    }
    double ounce()
    {
        convert=(16)*w.getval();
        return convert;
    }
}
class ounce extends weights
{
    weights w=new weights();
    double convert;
    ounce(double val){ w.setval(val); }
    double milligram()
    {
        convert=(0)*w.getval();
        return convert;
    }
    double gram()
    {
        convert=(28.3495)*w.getval();
        return convert;
    }
    double litre()
    {
        convert=(33.814)*w.getval();
        return convert;
    }
    double millilitre()
    {
        convert=(0.033814)*w.getval();
        return convert;
    }
    double kilogram()
    {
        convert=(0.0283495)*w.getval();
        return convert;
    }
    double tonne()
    {
        convert=(0.0000283495)*w.getval();
        return convert;
    }
    double pounds()
    {
        convert=(0.0625)*w.getval();
        return convert;
    }
    double kilolitre()
    {
        convert=(33814)*w.getval();
        return convert;
    }
}

class distance extends conversion
{
    double n;
    conversion c=new conversion();
    distance()
    {
        c.setval(n);
        c.getval();
    }
}
class kilometres extends distance {

    double convert;

    distance d = new distance();

    kilometres(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (1000) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (100000) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (1000000) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (1000000000) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (1000000000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.621) * d.getval();
        return convert;
    }

    double yard() {
        convert = (1093.613) * d.getval();
        return convert;
    }

    double foot() {
        convert = (3280) * d.getval();
        return convert;
    }

    double inch() {
        convert = (39370.079) * d.getval();
        return convert;
    }
}
class metre extends distance {

    double convert;

    distance d = new distance();

    metre(double val) {
        d.setval(val);
    }
    double kilometre() {
        convert = (0.001) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (100) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (1000) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (1000000) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (1000000000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.000621371) * d.getval();
        return convert;
    }

    double yard() {
        convert = (1.09361) * d.getval();
        return convert;
    }

    double foot() {
        convert = (3.28084) * d.getval();
        return convert;
    }

    double inch() {
        convert = (39.3701) * d.getval();
        return convert;
    }
}
class centimetre extends distance {

    double convert;

    distance d = new distance();

    centimetre(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.01) * d.getval();
        return convert;
    }
    double kilometre() {
        convert = (0.0000100000054) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (10) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (10000) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (10000000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.0000062137) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.0109361) * d.getval();
        return convert;
    }

    double foot() {
        convert = (0.0328084) * d.getval();
        return convert;
    }

    double inch() {
        convert = (0.393701) * d.getval();
        return convert;
    }
}
class millimetre extends distance {

    double convert;

    distance d = new distance();

    millimetre(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.001) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (0.1) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.000001) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (1000) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (1000000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.00000062137) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.00109361) * d.getval();
        return convert;
    }

    double foot() {
        convert = (0.00328084) * d.getval();
        return convert;
    }

    double inch() {
        convert = (0.0393701) * d.getval();
        return convert;
    }
}
class micrometre extends distance {

    double convert;

    distance d = new distance();

    micrometre(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.000001) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (0.0001) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (0.001) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.000000001) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (1000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.00000000062137) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.000001093611199694) * d.getval();
        return convert;
    }

    double foot() {
        convert = (0.0000032808) * d.getval();
        return convert;
    }

    double inch() {
        convert = (0.00003937) * d.getval();
        return convert;
    }
}
class nanometre extends distance {

    double convert;

    distance d = new distance();

    nanometre(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.000000001) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (0.0000001) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (0.000001) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (0.001) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.000000000001) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.00000000000062137) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.0000000010936) * d.getval();
        return convert;
    }
    double foot() {
        convert = (0.0000000032808) * d.getval();
        return convert;
    }

    double inch() {
        convert = (0.00000003937) * d.getval();
        return convert;
    }
}
class mile extends distance {

    double convert;

    distance d = new distance();

    mile(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (1609.34) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (160934) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (1609000) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (1609000000) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (1609000000) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (1.60934) * d.getval();
        return convert;
    }

    double yard() {
        convert = (1760) * d.getval();
        return convert;
    }

    double foot() {
        convert = (5280) * d.getval();
        return convert;
    }

    double inch() {
        convert = (63360) * d.getval();
        return convert;
    }
}
class yard extends distance {

    double convert;

    distance d = new distance();

    yard(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.9144) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (91.44) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (914.4) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (914400) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (914400000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.000568182) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.0009144) * d.getval();
        return convert;
    }

    double foot() {
        convert = (3) * d.getval();
        return convert;
    }

    double inch() {
        convert = (36) * d.getval();
        return convert;
    }
}
class foot extends distance {

    double convert;

    distance d = new distance();

    foot(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.3048) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (304800) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (304.8) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (304800) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (304800000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.000189394) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.333333) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.0003048) * d.getval();
        return convert;
    }

    double inch() {
        convert = (12) * d.getval();
        return convert;
    }
}
class inch extends distance {

    double convert;

    distance d = new distance();

    inch(double val) {
        d.setval(val);
    }
    double metre() {
        convert = (0.0254) * d.getval();
        return convert;
    }
    double centimetre() {
        convert = (2.54) * d.getval();
        return convert;
    }

    double millimetre() {
        convert = (25.4) * d.getval();
        return convert;
    }

    double micrometre() {
        convert = (25400) * d.getval();
        return convert;
    }

    double nanometre() {
        convert = (25400000) * d.getval();
        return convert;
    }

    double mile() {
        convert = (0.000015783) * d.getval();
        return convert;
    }

    double yard() {
        convert = (0.0277778) * d.getval();
        return convert;
    }

    double foot() {
        convert = (0.0833333) * d.getval();
        return convert;
    }

    double kilometre() {
        convert = (0.0000254) * d.getval();
        return convert;
    }
}