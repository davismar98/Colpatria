package com.example.davis.colpatria;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ProductosActivity extends AppCompatActivity implements ClickListener{
    @Override
    public void onClick(View view, int position) {
        Producto pSelected = listProductos.get(position);
        Toast.makeText(this, pSelected.getNombre(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLongClick(View view, int position) {

    }

    ArrayList<Producto> listProductos;
    AdapterProductos adapterProductos;
    RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        recyclerView = findViewById(R.id.recycler_view);

        addProductos();

        adapterProductos = new AdapterProductos(this, listProductos);
        adapterProductos.setClickListener(this);
        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapterProductos);

        //sListView = findViewById(R.id.list);


    }

    public void addProductos(){
        listProductos = new ArrayList<>();
        Producto p = new Producto("Alisador", "https://home.ripley.cl/store/Attachment/WOP/D200/2000331399505/2000331399505_2.jpg", "1200", "Alisador para el cabello marca X de alta calidad.");
        Producto p2 = new Producto("Escoba", "https://www.smartnfinal.com.mx/wp-content/uploads/2017/09/6061-Escoba-Cali-Clean.jpg", "2300", "Escoba con palo de madera adsadfadf.");
        listProductos.add(p);
        listProductos.add(p2);

    }

}
