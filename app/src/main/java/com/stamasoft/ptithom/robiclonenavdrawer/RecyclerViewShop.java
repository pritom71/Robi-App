package com.stamasoft.ptithom.robiclonenavdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewShop extends RecyclerView.Adapter<RecyclerViewShop.ViewHolder> {


    private ArrayList<String> ImageNames ;
    private ArrayList<String> Images;
    private ArrayList<String> Price;
    private ArrayList<String> Dis;
    private Context mcontext;

    @NonNull
    @Override
    public RecyclerViewShop.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_phone_hd, parent, false);
        RecyclerViewShop.ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    public RecyclerViewShop(Context context, ArrayList<String> imageUrls, ArrayList<String> names,ArrayList<String> prices, ArrayList<String> discounts) {
        ImageNames = names;
        Images = imageUrls;
        Price = prices;
        Dis = discounts;
        mcontext = context;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewShop.ViewHolder holder, int position) {
        holder.imageName.setText(ImageNames.get(position));
        holder.dis.setText(Dis.get(position));
        holder.price.setText(Price.get(position));

        Glide.with(mcontext)
                .asBitmap()
                .load(Images.get(position))
                .into(holder.image);
    }
    @Override
    public int getItemCount() {
        return Math.min(Math.min(Dis.size(), ImageNames.size()), Price.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView imageName;
        TextView dis;
        TextView price;
        //RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.card_view_shop);
            imageName = itemView.findViewById(R.id.tv_shop1_name);
            price = itemView.findViewById(R.id.tv_shop1_price);
            dis = itemView.findViewById(R.id.tv_shop1_discount);

        }
    }
}
