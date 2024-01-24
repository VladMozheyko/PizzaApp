package com.example.pizzaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Pizza> pizzas;

    public MainAdapter(Context context, List<Pizza> pizzas){   // Полуили данные для списка
        inflater = LayoutInflater.from(context);
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.main_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        Pizza pizza = pizzas.get(position);                   // Получаем пиццу соответсвующую номеру списка
        holder.imageView.setImageResource(pizza.getImg());    // Выводим конкретные данные в элемент списка
        holder.txtTitle.setText(pizza.getTitle());
        holder.txtDescription.setText(pizza.getDescription());

    }

    @Override
    public int getItemCount() {
        return pizzas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        TextView txtTitle;
        TextView txtDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pizza_img);            // Привязка к элементам макета
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtDescription = itemView.findViewById(R.id.txt_description);
        }
    }
}
