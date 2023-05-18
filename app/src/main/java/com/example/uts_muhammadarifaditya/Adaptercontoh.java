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

public class Adaptercontoh extends RecyclerView.Adapter<holderc> {
    Context contextp;
    List<contoh2>listp;

    public Adaptercontoh(Context contextp, List<contoh2> listp) {
        this.contextp = contextp;
        this.listp = listp;
    }

    @NonNull
    @Override
    public holderc onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(contextp);
        View view = inflater.inflate(R.layout.itemp, parent,false);
        return new holderc(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderc holder, int position) {
        contoh2 perleo = listp.get(position);
        holder.imgpn.setImageResource(perleo.getImgpr());
        holder.n.setText(perleo.getNama());
        holder.d.setText(perleo.getDeskripsi());

    }

    @Override
    public int getItemCount() {
        return listp.size();
    }
}
class holderc extends RecyclerView.ViewHolder{
    ImageView imgpn;
    TextView n,d;

    public holderc(@NonNull View itemView) {
        super(itemView);
        imgpn = itemView.findViewById(R.id.imgp);
        n = itemView.findViewById(R.id.np);
        d = itemView.findViewById(R.id.dp);
    }
}
