package com.example.uts_muhammadarifaditya;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterrumus extends RecyclerView.Adapter<holder> {
    Context context;
    List<rumus2>listjm;

    public Adapterrumus(Context context, List<rumus2> listjm) {
        this.context = context;
        this.listjm = listjm;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.itemjm, parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        rumus2 jenismo = listjm.get(position);
        holder.img.setImageResource(jenismo.getImgjm());
        holder.njmi.setText(jenismo.getNama());
        holder.cjmi.setText(jenismo.getContoh());
        holder.djmi.setText(jenismo.getDeskripsi());
        holder.djmi2.setText(jenismo.getdes2());

    }

    @Override
    public int getItemCount() {
        return listjm.size();
    }
}
class holder extends RecyclerView.ViewHolder{
    ImageView img;
    TextView njmi,cjmi,djmi,djmi2;

    public holder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.imgjm);
        njmi = itemView.findViewById(R.id.njm);
        cjmi = itemView.findViewById(R.id.cjm);
        djmi = itemView.findViewById(R.id.djm);
        djmi2 = itemView.findViewById(R.id.djm2);
    }
}
