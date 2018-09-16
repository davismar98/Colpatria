package com.example.davis.colpatria;

/**
 * Created by VMac on 17/11/16.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private int SELF = 100;
    private ArrayList<Message> messageArrayList;


    public ChatAdapter(ArrayList<Message> messageArrayList) {
        this.messageArrayList = messageArrayList;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;

        // view type is to identify where to render the chat message
        // left or right
        if (viewType == SELF) {
            // self message
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_item_self, parent, false);
        } else {
            // WatBot message
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_item_watson, parent, false);
        }


        return new ViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        Message message = messageArrayList.get(position);
        if (message.getId() != null && message.getId().equals("1")) {
            return SELF;
        }

        return position;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        Message message = messageArrayList.get(position);

        if (message.getMessage() != null) {
            String[] parts = message.getMessage().split("_");

            //message.isImages();

            if (parts.length > 1) {
                //message.setMessage(parts[0]);
                ((ViewHolder) holder).message.setVisibility(View.GONE);
                Glide.with(((ViewHolder) holder).img1.getContext())
                        .load("https://www.gizbot.com/images/2018-02/apple-iphone-xe-2018-concept-design_151851336080.jpg")
                        .into(((ViewHolder) holder).img1);
                Glide.with(((ViewHolder) holder).img2.getContext())
                        .load("https://media.tracfone.com/wps/contenthandler/dav/content/libraries/wcm.library.phones/components/STSAG960U1C/wcm.comps.image/st_ecom_large_1.png")
                        .into(((ViewHolder) holder).img2);
                Glide.with(((ViewHolder) holder).img3.getContext())
                        .load("https://cdn2.gsmarena.com/vv/bigpic/xiaomi-mi-mix2-new.jpg")
                        .into(((ViewHolder) holder).img3);
                //((ViewHolder) holder).message.setText(parts[0]);
            } else {
                ((ViewHolder) holder).message.setVisibility(View.VISIBLE);
                message.setMessage(message.getMessage());
                ((ViewHolder) holder).message.setText(message.getMessage());

            }
        }


        /*message.setMessage(message.getMessage());
        ((ViewHolder) holder).message.setText(message.getMessage());*/
    }

    @Override
    public int getItemCount() {
        return messageArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView message;
        ImageView img1;
        ImageView img2;
        ImageView img3;

        public ViewHolder(View view) {
            super(view);
            message = (TextView) itemView.findViewById(R.id.message);
            img1 = itemView.findViewById(R.id.photoImageView1);
            img2 = itemView.findViewById(R.id.photoImageView2);
            img3 = itemView.findViewById(R.id.photoImageView3);


            //TODO: Uncomment this if you want to use a custom Font
            /*String customFont = "Montserrat-Regular.ttf";
            Typeface typeface = Typeface.createFromAsset(itemView.getContext().getAssets(), customFont);
            message.setTypeface(typeface);*/

        }
    }


}