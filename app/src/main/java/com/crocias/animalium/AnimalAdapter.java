package com.crocias.animalium;

/**
 * Created by Jefri Yushendri on 26/11/2016.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.MyViewHolder> {

    private List<AnimalModel> animalList;
    Context context;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nama;
        ImageView gambar;
        LinearLayout layoutanimal;

        public MyViewHolder(View view) {
            super(view);
            gambar = (ImageView) view.findViewById(R.id.gambar);
            nama = (TextView) view.findViewById(R.id.nama);
            layoutanimal = (LinearLayout) view.findViewById(R.id.layout_animal);


        }
    }


    public AnimalAdapter(Context context, List<AnimalModel> animalList) {
        this.animalList = animalList;
        this.context= context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final AnimalModel animal = animalList.get(position);
        holder.nama.setText(animal.getNamaIndo());
        holder.gambar.setImageResource(animal.getGambar());
        holder.layoutanimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,animal.getNamaEng(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }
}