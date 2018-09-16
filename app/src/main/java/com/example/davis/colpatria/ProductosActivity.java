package com.example.davis.colpatria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ProductosActivity extends AppCompatActivity {

    ListView sListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        sListView = findViewById(R.id.list);

        CustomAdapter customAdapter =new CustomAdapter();
        sListView.setAdapter(customAdapter);
        sListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                switch (i) {
                    /*case 0:  Intent myintent = new Intent(MainActivity.this, Info.class);
                        startActivity(myintent);
                        break;
                    case 1:  Intent myintent1 = new Intent(MainActivity.this, Info2.class);
                        startActivity(myintent1);
                        break;
                    case 2:  Intent myintent2 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(myintent2);
                        break;
                    case 3:  Intent myintent3 = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(myintent3);
                        break;*/
                }

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {

        }

        return super.onOptionsItemSelected(item);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0; //images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView sImageView =view1.findViewById(R.id.imageView);
            TextView mTextVIew = view1.findViewById(R.id.TextView);
            TextView sTextVIew = view1.findViewById(R.id.TextView1);

            //sImageView.setImageResource(images[i]);
            //mTextVIew.setText(Names[i]);
            //sTextVIew.setText(Puntos[i]);

            return view1;
        }
    }
}
