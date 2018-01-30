package com.example.liam.saferjourneymockup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeaderBoardFragment extends Fragment {
    private RecyclerView rv;

    private ArrayList<User> userList = new ArrayList<>();

    public LeaderBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_leaderboard, container, false);
        rv = (RecyclerView) mView.findViewById(R.id.leader_board_rv);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        rv.setLayoutManager(llm);
        addUsers();

        RVAdapter adapter = new RVAdapter(userList);
        rv.setAdapter(adapter);

        return mView;
    }

    class User {

        String points, photoId, userName;
        int rank;
        User(int rank, String name, String points) {
            this.rank = rank;
            this.userName = name;
            this.points = points;
//            this.photoId = photoId;
        }
    }

    private void addUsers() {
        for (int i = 0; i < 1000; i++) {
            userList.add(new User(i, ))
        }
    }
}
