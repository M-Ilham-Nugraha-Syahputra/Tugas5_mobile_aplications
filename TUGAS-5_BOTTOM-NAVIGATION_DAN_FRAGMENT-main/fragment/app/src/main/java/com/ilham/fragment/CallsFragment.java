package com.ilham.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CallsFragment extends Fragment {


    public CallsFragment() {
        // Required empty public constructor
    }

    private List<Callslist> lists = new ArrayList<>();
    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        recyclerView = view.findViewById(R.id.recyclerViews);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getCallslist();
        return view;
    }
    private void getCallslist() {
        //Tampilan data telpon
        lists.add(new Callslist("11","Ronaldo","Kemarin 19.57","https://akcdn.detik.net.id/community/media/visual/2021/09/30/cristiano-ronaldo-1_169.jpeg?w=700&q=90"));
        lists.add(new Callslist("22","Saitama Gym","(2) 11 Oktober 09.20","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));
        lists.add(new Callslist("33","Saitama Gym","7 Oktober 17.01","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));
        lists.add(new Callslist("44","Hinata","4 Oktober 13.12","https://lepasjenuh.com/wp-content/uploads/2020/09/480-4804352_hinata-hyuga-png-download-hinata-and-baby-himawari.png"));
        lists.add(new Callslist("55","Mikey","9 November 23.20","https://media-assets-ggwp.s3.ap-southeast-1.amazonaws.com/2021/07/fakta-menarik-mikey-tokyo-revengers-1.jpg"));

        recyclerView.setAdapter(new CallsListAdapter(lists,getContext()));

    }
}