package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_C,button_yuzde,button_div;
    Button button_yedi,button_sekiz,button_dokuz,button_carpma;
    Button button_dort,button_bes,button_alti,button_cikarma;
    Button button_bir,button_iki,button_uc,button_toplama;
    Button button_AC,button_sifir,button_nokta,button_esittir;

    TextView sonuc,cozum;

    boolean toplama,cikarma,div,carpma;

    float degerBir,degerİki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonuc=findViewById(R.id.sonuc);
        cozum=findViewById(R.id.cozum);

        button_yuzde=(Button)findViewById(R.id.button_yuzde);
        button_C=(Button) findViewById(R.id.button_C);
        button_div=(Button) findViewById(R.id.button_div);
        button_yedi=(Button) findViewById(R.id.button_yedi);
        button_sekiz=(Button) findViewById(R.id.button_sekiz);
        button_dokuz=(Button) findViewById(R.id.button_dokuz);
        button_carpma=(Button) findViewById(R.id.button_carpma);
        button_dort=(Button) findViewById(R.id.button_dort);
        button_bes=(Button) findViewById(R.id.button_bes);
        button_alti=(Button) findViewById(R.id.button_alti);
        button_cikarma=(Button) findViewById(R.id.button_cikarma);
        button_bir=(Button) findViewById(R.id.button_bir);
        button_iki=(Button) findViewById(R.id.button_iki);
        button_uc=(Button) findViewById(R.id.button_uc);
        button_toplama=(Button) findViewById(R.id.button_toplama);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_sifir=(Button) findViewById(R.id.button_sifir);
        button_nokta=(Button) findViewById(R.id.button_nokta);
        button_esittir=(Button) findViewById(R.id.button_esittir);

        button_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("1");
                cozum.setText(sonuc.getText());
            }
        });
        button_iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("2");
                cozum.setText(sonuc.getText());

            }
        });
        button_uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("3");
                cozum.setText(sonuc.getText());
            }
        });
        button_dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("4");
                cozum.setText(sonuc.getText());
            }
        });
        button_bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("5");
                cozum.setText(sonuc.getText());

            }
        });
        button_alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("6");
                cozum.setText(sonuc.getText());
            }
        });
        button_yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("7");
                cozum.setText(sonuc.getText());
            }
        });
        button_sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("8");
                cozum.setText(sonuc.getText());

            }
        });
        button_dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("9");
                cozum.setText(sonuc.getText());
            }
        });
        button_sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append("0");
                cozum.setText(sonuc.getText());
            }
        });
        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.append(".");
                cozum.setText(sonuc.getText());
            }
        });
        button_yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().length()>0){
                    degerBir=Float.parseFloat(sonuc.getText()+(" "));
                    sonuc.setText(degerBir/100+" ");
                }
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(" ");
                cozum.setText(" ");
            }
        });
        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sonuc==null){
                    sonuc.setText("");
                }
                else {
                    degerBir=Float.parseFloat(sonuc.getText()+" ");
                    toplama=true;
                    sonuc.setText(null);
                }
            }
        });
        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerBir=Float.parseFloat(sonuc.getText()+" ");
                cikarma=true;
                sonuc.setText(null);
            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerBir=Float.parseFloat(sonuc.getText()+" ");
                div=true;
                sonuc.setText(null);
            }
        });
        button_carpma .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerBir=Float.parseFloat(sonuc.getText()+" ");
                carpma=true;
                sonuc.setText(null);
            }
        });
        button_esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerİki=Float.parseFloat(sonuc.getText()+" ");
                if(toplama== true){
                    sonuc.setText(degerBir+degerİki+"");
                    cozum.setText(degerBir+"+"+degerİki);
                    toplama=false;
                }
                if (cikarma==true){
                    sonuc.setText(degerBir-degerİki+"");
                    cozum.setText(degerBir+"-"+degerİki);
                    cikarma=false;
                }
                if (div==true){
                    sonuc.setText(degerBir/degerİki+"");
                    cozum.setText(degerBir+"/"+degerİki);
                    cikarma=false;
                }
                if(carpma==true){
                    sonuc.setText(degerBir*degerİki+"");
                    cozum.setText(degerBir+"*"+degerİki);
                    carpma=false;
                }
            }
        });
        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = sonuc.getText();
                if (text != null && text.length() > 0) {
                    sonuc.setText(text.subSequence(0, text.length() - 1));
                }
            }
        });




    }
}