package com.example.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnKo, btnPapir, btnOllo;
    private TextView textEredmeny;
    private ImageView imageGep, imageJatekos;
    private Random r;
    private int gepPontszam, jatekosPontszam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        btnKo.setOnClickListener(this);

    }

    private void init(){
        btnKo = findViewById(R.id.btnKo);
        btnPapir = findViewById(R.id.btnPapir);
        btnOllo = findViewById(R.id.btnOllo);
        textEredmeny = findViewById(R.id.textEredmeny);
        imageGep = findViewById(R.id.imageGep);
        imageJatekos = findViewById(R.id.imageJatekos);
        r = new Random();
        gepPontszam = 0;
        jatekosPontszam = 0;

    }

    @Override
    public void onClick(View v) {
        String jatekosValasztasa = "";
        switch (v.getId()){
            case R.id.btnKo:
                jatekosValasztasa = "ko";
                imageJatekos.setImageResource(R.drawable.rock);
                break;
            case R.id.btnPapir:
                jatekosValasztasa = "papir";
                imageJatekos.setImageResource(R.drawable.paper);
                break;
            case R.id.btnOllo:
                jatekosValasztasa = "ollo";
                imageJatekos.setImageResource(R.drawable.scissors);
                break;
        }
    }
}
