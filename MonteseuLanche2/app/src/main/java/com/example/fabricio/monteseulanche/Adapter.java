package com.example.fabricio.monteseulanche;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Fabricio on 02/07/2016.
 */
public class Adapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Lanche> lanches;

    public Adapter(List<Lanche> itens, Context context) {
        this.lanches = itens;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lanches.size();
    }

    @Override
    public Object getItem(int i) {
        return lanches.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Lanche l = lanches.get(i);

        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.item_layout,
                    viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }


        holder.tvNome.setText(l.getNome());


        holder.tvValor.setText("R$: " + l.getValor());

        if (l.getValor() < 10) {
            holder.tvValor.setTextColor(
                    ContextCompat.getColor(view.getContext(),
                            R.color.colorText)
            );
        }


        return view;
    }

    static class ViewHolder {
        @BindView(R.id.tvNome) TextView tvNome;

        @BindView(R.id.tvValor) TextView tvValor;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
