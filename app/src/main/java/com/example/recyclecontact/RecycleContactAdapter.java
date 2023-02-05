package com.example.recyclecontact;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContactAdapter extends RecyclerView.Adapter<RecycleContactAdapter.ViewHolder> {
   Context context;
   ArrayList<String> name;
   ArrayList<String> number;

    RecycleContactAdapter(Context context, ArrayList<String> number,ArrayList<String> name ){
       this.context = context;
       this.number = number;
       this.name = name;
   }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.img.setImageResource(arrayList.get(position).img);
        holder.name.setText(name.get(position));
        holder.number.setText(number.get(position));
        setAnimation(holder.itemView);
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView name,number;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
        }
    }
    public void setAnimation(View viewToAnimation){
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        viewToAnimation.startAnimation(animation);
    }
}
