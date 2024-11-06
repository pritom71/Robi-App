package com.stamasoft.ptithom.robiclonenavdrawer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class RecyclerViewAdapter_4 extends RecyclerView.Adapter<RecyclerViewAdapter_4.ViewHolder>{

//private static final String TAG = "RecyclerViewAdapter_2";

    private ArrayList<String> wImageNames ;
    private ArrayList<String> wImages;
    private Context mContext;



    public RecyclerViewAdapter_4(Context context, ArrayList<String> imageNames, ArrayList<String> images ) {
        wImageNames = imageNames;
        wImages = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.whatsnew2, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        // Log.d(TAG, "onBindViewHolder: called.");


        holder.imageName.setText(wImageNames.get(position));

        Glide.with(mContext)
                .asBitmap()
                .load(wImages.get(position))
                .into(holder.image);

};


    @Override
    public int getItemCount() {
        return wImageNames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView imageName;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_Card_3);
            imageName = itemView.findViewById(R.id.header_whtsnew2);


            parentLayout = itemView.findViewById(R.id.parent_layout);

            // parentLayout = itemView.findViewById(R.id.editTextSearch);
        }
    }
}