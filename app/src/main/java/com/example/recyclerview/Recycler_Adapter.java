package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.MyviewHolder> {

    private List<String> list;
    public Recycler_Adapter(List<String> list){
        this.list=list;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_text_view,parent,false);
        MyviewHolder myviewHolder = new MyviewHolder(textView);
        return myviewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.list_array.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder {

        TextView list_array;
        public MyviewHolder(@NonNull TextView itemView) {
            super(itemView);
            list_array = itemView;
        }
    }
}