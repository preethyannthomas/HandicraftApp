package com.example.handicraftapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class HandicraftAdapter extends RecyclerView.Adapter<HandicraftAdapter.HandicraftViewHolder> {
    private List<HandicraftItem> mHandicraftList;
    public static class HandicraftViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTitleTextView;
        public TextView mDescriptionTextView;
        public TextView mPriceTextView;
        public HandicraftViewHolder(View itemView) {
            super(itemView); mImageView = itemView.findViewById(R.id.image_view);
            mTitleTextView = itemView.findViewById(R.id.title_text_view);
            mDescriptionTextView = itemView.findViewById(R.id.description_text_view);
            mPriceTextView = itemView.findViewById(R.id.price_text_view);
        }
    }
    public HandicraftAdapter(List<HandicraftItem> handicraftList) {
        mHandicraftList = handicraftList;
    }
    @NonNull
    @Override
    public HandicraftViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.handicraft_item, parent, false);
        HandicraftViewHolder viewHolder = new HandicraftViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull HandicraftViewHolder holder, int position) {
        HandicraftItem currentItem = mHandicraftList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTitleTextView.setText(currentItem.getTitle());
        holder.mDescriptionTextView.setText(currentItem.getDescription());
        holder.mPriceTextView.setText("$" + String.format("%.2f", currentItem.getPrice()));
    }
    @Override public int getItemCount() {
        return mHandicraftList.size();
    }
}
