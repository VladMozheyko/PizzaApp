package com.example.pizzaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder> {

    private Context mContext;           // Контекст в котором создается жта часть приложения
    private List<Integer> mImages;      // Картинки для списка

    public TopAdapter(Context context, List<Integer> images){ // Получаем конкретные данные для списка
        mContext = context;
        mImages = images;
    }


    /*
    Класс адаптер - класс который приспосабливает что-либо в данном случае присобливается
    список к конкретному набору атрибутов
     */
    @NonNull
    @Override  // Метод вызывается при создании списка
    public TopAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.top_list_item,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopAdapter.ViewHolder holder, int position) {
        int index = mImages.get(position);     // Система сама определит какой это элемент списка
        holder.index = index;
        holder.imageView.setText("Hello");
        holder.imageView.setBackgroundResource(index);


    }

    @Override
    public int getItemCount() {
        return mImages.size();    // Количество элементов
    }

    /*
    holder - класс который управляет виджетами
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        public Button imageView;

        int index;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.top_img);
        }
    }
}
