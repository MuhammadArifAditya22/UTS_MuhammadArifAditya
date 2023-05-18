package com.example.uts_muhammadarifaditya;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterdefenisi extends RecyclerView.Adapter<holderd> {
    Context contextpln;
    List<defenisi2>listpl;

    public Adapterdefenisi(Context contextpln, List<defenisi2> listpl) {
        this.contextpln = contextpln;
        this.listpl = listpl;
    }

    @NonNull
    @Override
    public holderd onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextpln);
        View view = inflater.inflate(R.layout.itempl, parent,false);
        return new holderd(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderd holder, int position) {
        defenisi2 pn = listpl.get(position);
        holder.judul.setText(pn.getJudul());
        holder.ciri.setText(pn.getCiri());
        holder.jciri.setText(pn.getJciri());
        holder.sifat.setText(pn.getSifat());
        holder.jsifat.setText(pn.getJsifat());
    }

    @Override
    public int getItemCount() {
        return listpl.size();
    }
}
class holderd extends RecyclerView.ViewHolder{
    TextView judul, ciri,jciri,sifat,jsifat;

    public holderd(@NonNull View itemView) {
        super(itemView);
        judul = itemView.findViewById(R.id.judul);
        ciri = itemView.findViewById(R.id.ciri);
        jciri = itemView.findViewById(R.id.jciri);
        sifat = itemView.findViewById(R.id.sifat);
        jsifat = itemView.findViewById(R.id.jsifat);
    }
}
