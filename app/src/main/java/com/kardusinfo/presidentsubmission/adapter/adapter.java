package com.kardusinfo.presidentsubmission.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kardusinfo.presidentsubmission.DetailActivity;
import com.kardusinfo.presidentsubmission.R;
import com.kardusinfo.presidentsubmission.database.database;

import java.util.List;
import java.util.TreeMap;

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    private List<database> list;

    public adapter(List<database> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_list, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView fotonya;
        TextView usianya;
        TextView asalnya;
        TextView namanya;

        public ViewHolder(View itemView) {
            super(itemView);
            fotonya = (ImageView) itemView.findViewById(R.id.gambarnya);
            namanya = (TextView) itemView.findViewById(R.id.namanya);
            usianya = (TextView) itemView.findViewById(R.id.usianya);
            asalnya = (TextView) itemView.findViewById(R.id.asalnya);
        }

        public void bind(final database item) {
            fotonya.setImageResource(item.getFoto());
            namanya.setText(item.getNama());
            usianya.setText(item.getUsia());
            asalnya.setText(item.getAsal());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra(DetailActivity.GAMBAR, item.getFoto2());
                    intent.putExtra(DetailActivity.NAMA, item.getNama());
                    intent.putExtra(DetailActivity.DESCRIPTION, item.getDescription());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
