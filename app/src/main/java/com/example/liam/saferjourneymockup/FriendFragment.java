package com.example.liam.saferjourneymockup;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendFragment extends Fragment {
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    final java.util.Random rand = new java.util.Random();
    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    final Set<String> identifiers = new HashSet<String>();

    private RecyclerView rv;

    private ArrayList<User> friendList = new ArrayList<>();

    public FriendFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView = inflater.inflate(R.layout.fragment_friend, container, false);
        rv = (RecyclerView) mView.findViewById(R.id.friend_rv);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        rv.setLayoutManager(llm);

        RVAdapter adapter = new RVAdapter(friendList);
        rv.setAdapter(adapter);

        LeaderBoardFragment leaderBoardFragment = new LeaderBoardFragment();

        User user = new User();
        friendList = user.getUers(100, 13000);

        return mView;
    }

}
