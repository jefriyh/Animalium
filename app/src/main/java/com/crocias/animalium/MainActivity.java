package com.crocias.animalium;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<AnimalModel> animalModelList = new ArrayList<>();
    private RecyclerView recyclerView;
    private AnimalAdapter animalAdapter;
    private AnimalModel animal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        animalAdapter = new AnimalAdapter(getApplicationContext(), animalModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(animalAdapter);

        prepareData();
    }


    private void prepareData(){
        addToList(R.drawable.anbull, "Banteng", "Bull");
        addToList(R.drawable.anchick, "Ayam", "Chick");
        addToList(R.drawable.ancrab, "Kepiting", "Crab");
        addToList(R.drawable.anfox, "Rubah", "Fox");
        addToList(R.drawable.anhedgehog, "Landak", "Hedgehog");
        addToList(R.drawable.anhippopotamus, "Kuda Nil", "Hippopotamus");
        addToList(R.drawable.ankoala, "Koala", "Koala");
        addToList(R.drawable.anlemur, "Lemur", "Kukang");
        addToList(R.drawable.anpig, "Babi", "Pig");
        addToList(R.drawable.antiger, "Harimau", "Tiger");
        addToList(R.drawable.anwhale, "Paus", "Whale");
        addToList(R.drawable.anzebra, "Zebra", "Zebra");
    }


    private void addToList(int gambar, String namaInd, String namaEng){
        animal = new AnimalModel(gambar, namaInd, namaEng);
        animalModelList.add(animal);

    }

}
