package com.example.exercise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {

    private Context c;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView iv;
        public MyViewHolder(View v) {
            super(v);
            iv = v.findViewById(R.id.item_image_view);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListAdapter(Context c) {
        this.c = c;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        String url = String.format("https://picsum.photos/500/500?image=%d", position);
        Glide.with(c).clear(holder.itemView);
        Glide.with(c).load(url).into(holder.iv);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return 50;
    }
}
