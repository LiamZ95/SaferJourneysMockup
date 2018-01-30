package com.example.liam.saferjourneymockup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Liyu Zhang on 30/1/18.
 */

class User {
    final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";
    final java.util.Random rand = new java.util.Random();
    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    final Set<String> identifiers = new HashSet<String>();

    String userName;
    int rank, points;

    User() {

    }

    User(int rank, String name, int points) {
        this.rank = rank;
        this.userName = name;
        this.points = points;
    }

    int randomScore() {
        return  rand.nextInt(100);
    }

    String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    ArrayList<User> getUers(int a, int b) {
        ArrayList<User> friendList = new ArrayList<>();
        int maxScore = b;
        friendList.clear();
        for (int i = 0; i < a; i++) {
            int score = maxScore - randomScore();
            friendList.add(new User(i+1, randomIdentifier(), score));
            maxScore = score;
        }
        return friendList;
    }
}