package com.example.learnanimals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolde> {
    public Context context;
    public List<listitem> listitem;

    public MyAdapter(Context context, List<listitem> listitem) {
        this.context = context;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolde onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolde(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolde holder, int position) {
        listitem item = listitem.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
        holder.image.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }

    public class ViewHolde extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView name;
        private  TextView description;
        private ImageView image;

        public ViewHolde(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            name = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.details);
            image = itemView.findViewById(R.id.imageView);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            listitem item = listitem.get(position);
            Toast.makeText(context,item.getName()+"\n"+item.getDescription(),Toast.LENGTH_LONG).show();
        }
    }
}

