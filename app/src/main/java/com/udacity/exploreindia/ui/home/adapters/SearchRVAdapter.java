package com.udacity.exploreindia.ui.home.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.udacity.exploreindia.R;
import com.udacity.exploreindia.ui.home.fragments.search.SearchModel;

import java.util.ArrayList;

public class SearchRVAdapter extends RecyclerView.Adapter<SearchRVAdapter.ViewHolder> {
    private Context context;
    private SearchModel searchModel;
    private ArrayList<SearchModel> lPopularDestinations;

    public SearchRVAdapter(Context context, ArrayList<SearchModel> lPopularDestinations) {
        this.context = context;
        this.lPopularDestinations = lPopularDestinations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.searchview_location_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        searchModel = lPopularDestinations.get(position);
        holder.ivLocations.setImageResource(R.drawable.gateway_of_india_small);
        holder.tvLocationName.setText(searchModel.getLoctionName());
    }


    @Override
    public int getItemCount() {
        return lPopularDestinations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivLocations;
        private TextView tvLocationName;

        public ViewHolder(View itemView) {
            super(itemView);
            ivLocations = itemView.findViewById(R.id.my_location_img_places);
            tvLocationName = itemView.findViewById(R.id.loaction_tv_name);
        }
    }

}
