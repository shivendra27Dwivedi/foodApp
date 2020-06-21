package com.example.assignment;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.databinding.RowUpcommingEventsBinding;
import com.example.assignment.models.DataModel;
import com.example.assignment.utils.ImageHelper;

import java.util.ArrayList;
import java.util.List;

public class UpcommingEventsAdapter extends RecyclerView.Adapter<UpcommingEventsAdapter.ViewHolder> {

    private List<DataModel.UpcomingEventsBean> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowUpcommingEventsBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.row_upcomming_events, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.bindRow();
    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public void setList(List<DataModel.UpcomingEventsBean> upcomingEventsBeanList) {
        list.clear();
        list.addAll(upcomingEventsBeanList);
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        RowUpcommingEventsBinding rowUpcommingEventsBinding;

        public ViewHolder(@NonNull RowUpcommingEventsBinding itemView) {
            super(itemView.getRoot());
            rowUpcommingEventsBinding = itemView;
        }

        public void bindRow() {
            String imageUrl = list.get(getAdapterPosition()).getIconURL();
            String time = list.get(getAdapterPosition()).getDateTime();
            String name = list.get(getAdapterPosition()).getName();
            String type = list.get(getAdapterPosition()).getType();
            String location = list.get(getAdapterPosition()).getLocation();

            ImageHelper.loadImage(itemView.getContext(), imageUrl, rowUpcommingEventsBinding.image);
            rowUpcommingEventsBinding.upcommingNameTv.setText(name);
            rowUpcommingEventsBinding.upcommingTimeTv.setText(time);
            rowUpcommingEventsBinding.upcommingTypeTv.setText(type);
            rowUpcommingEventsBinding.upcommingLocTv.setText(location);

        }
    }
}
