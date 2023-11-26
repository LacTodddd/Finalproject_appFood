package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.example.bottomnavigation.databinding.FragmentFoodBinding;

import java.util.ArrayList;


public class FoodFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        TextView btn = view.findViewById(R.id.text11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PizzaData.class));
            }
        });

        TextView btn1 = view.findViewById(R.id.text12);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), GekhuyData.class));
            }
        });

        TextView btn2 = view.findViewById(R.id.text13);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), gaipoi.class));
            }
        });

        TextView btn3 = view.findViewById(R.id.text14);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), BlueberryCheese.class));
            }
        });
        return view;
    }
}