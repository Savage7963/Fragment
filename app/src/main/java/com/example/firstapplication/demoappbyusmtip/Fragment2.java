package com.example.firstapplication.demoappbyusmtip;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class Fragment2 extends Fragment {

    // declare Buttons
    Button button1;
    Button button2;
    Button button3;
    Button button4;



    // declare imageView
    ImageView imageView;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_2, container, false);



        // find buttons by id
        button1 = (Button) view.findViewById(R.id.btnOneFragment2);
        button2 = (Button) view.findViewById(R.id.btnTwoFragment2);
        button3 = (Button) view.findViewById(R.id.btnThreeFragment2);
        button4 = (Button) view.findViewById(R.id.btnFourFragment2);


        // find imageView by id
        imageView = (ImageView) view.findViewById(R.id.imgFragment2);

        // set onclick listener on imageView
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "ImageView Clicked of Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });






        // set onclick listener on buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // perform any action on button click
                Toast.makeText(getActivity(), "Button 1 Clicked of Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button 2 Clicked of Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button 3 Clicked of Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button 4 Clicked of Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });



        // Inflate the layout for this fragment
        return view;
    }
}