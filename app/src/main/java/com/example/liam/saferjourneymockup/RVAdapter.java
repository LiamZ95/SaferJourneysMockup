package com.example.liam.saferjourneymockup;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


class RVAdapter extends RecyclerView.Adapter<RVAdapter.UserViewHolder>{
    ArrayList<LeaderBoardFragment.User> usersList;

    RVAdapter(ArrayList<LeaderBoardFragment.User> usersList) {
        this.usersList = usersList;
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView userId;
        TextView userPoints;
//        ImageView userPhoto;

        UserViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            userId = (TextView) itemView.findViewById(R.id.cv_user_name);
            userPoints = (TextView) itemView.findViewById(R.id.cv_user_points);
//            userPhoto = (ImageView) itemView.findViewById(R.id.cv_user_photo);
        }

    }

        @Override
    public RVAdapter.UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cardview, parent, false);
        UserViewHolder uvh = new UserViewHolder(v);
        return uvh;
    }

    @Override
    public void onBindViewHolder(RVAdapter.UserViewHolder holder, int position) {
        holder.userId.setText(usersList.get(position).userName);
        holder.userPoints.setText(usersList.get(position).points);
//        holder.userPhoto.setImageResource(usersList.get(position).photoId);

    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
