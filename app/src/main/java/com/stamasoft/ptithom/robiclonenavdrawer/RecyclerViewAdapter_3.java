package com.stamasoft.ptithom.robiclonenavdrawer;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class RecyclerViewAdapter_3 extends RecyclerView.Adapter<RecyclerViewAdapter_3.ViewHolder>{

//private static final String TAG = "RecyclerViewAdapter_2";

    private ArrayList<String> pImages;
    private Context mContext;



    public RecyclerViewAdapter_3(Context context, ArrayList<String> images ) {
        pImages = images;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.whatsnew, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        // Log.d(TAG, "onBindViewHolder: called.");


        Glide.with(mContext)
                .asBitmap()
                .load(pImages.get(position))
                .into(holder.image);

    }

    @Override
    public int getItemCount() {
        return pImages.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        LinearLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_Card_2);

            parentLayout = itemView.findViewById(R.id.parent_layout);

            // parentLayout = itemView.findViewById(R.id.editTextSearch);
        }
    }
}
