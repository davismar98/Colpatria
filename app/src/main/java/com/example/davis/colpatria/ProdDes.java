package com.example.davis.colpatria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class ProdDes extends AppCompatActivity {
    ImageView im;
    private String nombre;
    private String url;
    private String puntos;
    private String des;

    TextView t,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prod_des);
        Bundle bundle = getIntent().getExtras();

        if(bundle.getString("nombre")!= null)
        {
            nombre = bundle.getString("nombre");
            //TODO here get the string stored in the string variable and do
            // setText() on userName
        }
        if(bundle.getString("url")!= null)
        {
            url = bundle.getString("url");
            //TODO here get the string stored in the string variable and do
            // setText() on userName
        }
        if(bundle.getString("puntos")!= null)
        {
            puntos = bundle.getString("puntos");
            //TODO here get the string stored in the string variable and do
            // setText() on userName
        }
        if(bundle.getString("desc")!= null)
        {
            des = bundle.getString("desc");
            //TODO here get the string stored in the string variable and do
            // setText() on userName
        }
        t= findViewById(R.id.textView7);
        d= findViewById(R.id.textView6);
        t.setText("El producto "+nombre+" cuesta "+puntos+" puntos");
        d.setText(des);
        im = findViewById(R.id.imageView2);
        //Picasso.get().load(url).into(im);

    }
}
