package com.example.davis.colpatria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by DavidM on 26/03/2017.
 */

public class AdapterProductos extends RecyclerView.Adapter<AdapterProductos.myViewHolder>{

    private final LayoutInflater inflater;
    Context contextAct;
    ArrayList<Producto> listProductos;
    private ClickListener clickListener;

    public AdapterProductos(Context context, ArrayList<Producto> listData){
        inflater = LayoutInflater.from(context);
        this.listProductos = listData;
        this.contextAct=context;
    }
    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cardview_todos,parent,false);
        myViewHolder holder = new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        Producto p = listProductos.get(position);

        holder._nombrep.setText(p.getNombre());
        holder.puntosp.setText(p.getNombre());

        if (holder._imgproducto != null) {
            Glide.with(contextAct).load(p.getUrl()).into(holder._imgproducto);
        }

    }

    @Override
    public int getItemCount() {
        return listProductos.size();
    }

    public void setClickListener(ClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView _imgproducto;
        TextView _nombrep;
        TextView puntosp;

        public myViewHolder(View itemView) {
            super(itemView);

            _imgproducto = (ImageView) itemView.findViewById(R.id.img_producto);
            _nombrep = (TextView)  itemView.findViewById(R.id.txt_nombrep);
            puntosp = (TextView) itemView.findViewById(R.id.txt_puntosp);

            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
        }
    }
}
