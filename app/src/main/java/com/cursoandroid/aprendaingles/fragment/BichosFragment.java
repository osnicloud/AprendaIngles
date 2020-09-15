package com.cursoandroid.aprendaingles.fragment;


import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cursoandroid.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichosFragment extends Fragment {
        private Button buttonDog, buttonCat, buttonLion, buttonMonkey, buttonSheep, buttonCow;
        private MediaPlayer mediaPlayer;

    public BichosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_bichos, container, false);
        buttonDog = view.findViewById(R.id.buttonDog);
        buttonCat = view.findViewById(R.id.buttonCat);
        buttonLion = view.findViewById(R.id.buttonLion);
        buttonMonkey = view.findViewById(R.id.buttonMonkey);
        buttonSheep = view.findViewById(R.id.buttonSheep);
        buttonCow = view.findViewById(R.id.buttonCow);

        addListeners();
        return view;
    }

    public void addListeners(){
        buttonDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.dog);
            }
        });

        buttonCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.cat);
            }
        });

        buttonLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.lion);
            }
        });

        buttonMonkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.monkey);
            }
        });

        buttonSheep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.sheep);
            }
        });

        buttonCow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executarSom(R.raw.cow);
            }
        });
    }

    public void executarSom(int audio){
        mediaPlayer = MediaPlayer.create(getActivity(), audio);
        mediaPlayer.start();
        pararSom();
    }

    public void pararSom(){
        if(!mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
