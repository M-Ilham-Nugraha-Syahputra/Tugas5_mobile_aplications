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


public class ChatsFragment extends Fragment {

    public ChatsFragment() {
        // Required empty public constructor
    }

    private List<Chatlist> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getChatlist();
        return view;
    }

    private void getChatlist() {
        //Tampilan chat dari Ronaldo
        list.add(new Chatlist("11","Ronaldo","Bro, main bola nanti malem yak","10/10/2021","https://akcdn.detik.net.id/community/media/visual/2021/09/30/cristiano-ronaldo-1_169.jpeg?w=700&q=90"));

        //Tampilan chat dari Messi
        list.add(new Chatlist("22","Messi","Jangan lupa nanti sore kita ada tanding bola!!!","08/10/2021","https://asset-a.grid.id/crop/0x61:555x431/700x465/photo/2021/08/06/messiiijpg-20210806092629.jpg"));

        //Tampilan chat dari Saitama
        list.add(new Chatlist("33","Saitama Gym","Cara numbuhin rambut gimana ya bro?","11/10/2021","https://i0.wp.com/www.otakutale.com/wp-content/uploads/2015/03/One-Punch-Man-Anime-Twitter-Icon-Saitama.jpg?ssl=1"));

        //Tampilan chat dari Draken
        list.add(new Chatlist("44","Mikey","Gak keliatan draken?","Kemarin","https://media-assets-ggwp.s3.ap-southeast-1.amazonaws.com/2021/07/fakta-menarik-mikey-tokyo-revengers-1.jpg"));

        //Tampilan chat dari Nobita
        list.add(new Chatlist("55","Hinata","Eh, semalem naruto kerumahku lo","12/10/2021","https://lepasjenuh.com/wp-content/uploads/2020/09/480-4804352_hinata-hyuga-png-download-hinata-and-baby-himawari.png"));


        recyclerView.setAdapter(new ChatListAdapter(list,getContext()));
    }
}