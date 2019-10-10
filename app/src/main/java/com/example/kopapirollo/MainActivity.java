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
        int gepGeneralt = r.nextInt(3);
        String gepValasztasa = "";
        switch (gepGeneralt){
            case 0:
                gepValasztasa = "ko";
                imageGep.setImageResource(R.drawable.rock);
                break;
            case 1:
                gepValasztasa = "papir";
                imageGep.setImageResource(R.drawable.paper);
                break;
            case 2:
                gepValasztasa = "ollo";
                imageGep.setImageResource(R.drawable.scissors);
                break;
        }
        String uzenet = "";
        if (gepValasztasa.equals("ko") && jatekosValasztasa.equals("ollo")){
            gepPontszam++;
            uzenet = "A kő megbaszta az olló pengéit, meghaltál";
        } else if (gepValasztasa.equals("ko") && jatekosValasztasa.equals("papir")){
            jatekosPontszam++;
            uzenet = "A papir becsomagolta anyádat is, nyertél";
        } else if (gepValasztasa.equals("papir") && jatekosValasztasa.equals("ollo")){
            gepPontszam++;
            uzenet = "A papert elvágta az olló, myertel";
        } else if (gepValasztasa.equals("papir") && jatekosValasztasa.equals("ko")){
            jatekosPontszam++;
            uzenet = "A papper becsomizta a kavicsod te csicska, véegd";
        } else if (gepValasztasa.equals("ollo") && jatekosValasztasa.equals("papir")){
            gepPontszam++;
            uzenet = "A ollo elvag pépöir, vesztettél:)";
        } else if (gepValasztasa.equals("ollo") && jatekosValasztasa.equals("ko")){
            jatekosPontszam++;
            uzenet = "A ko elutotte a ollot nyertelc:(:";
        } else {
            uzenet = "dontetlen!44!XDD:)";
        }
    }
}
