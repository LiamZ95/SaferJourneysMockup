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
        User(String name, String points) {
            this.userName = name;
            this.points = points;
//            this.photoId = photoId;
        }
    }

    private void addUsers() {
        userList.add(new User("Wukong", "13000"));
        userList.add(new User("Micheal", "12000"));
        userList.add(new User("Tim", "11000"));
        userList.add(new User("Ada", "10000"));
        userList.add(new User("Neo", "9000"));
        userList.add(new User("Naruto", "8000"));
    }
}
