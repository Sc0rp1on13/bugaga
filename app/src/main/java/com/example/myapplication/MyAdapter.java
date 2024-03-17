package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;



public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List <item> item;

    public MyAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(item.get(position).getName());
        holder.amountView.setText(item.get(position).getAmount());
        holder.imageView.setImageResource(item.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
