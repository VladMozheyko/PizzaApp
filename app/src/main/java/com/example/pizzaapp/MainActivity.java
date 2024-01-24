package com.example.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
    RecyclerView - список в котором все компоненты перерисовываются т е заполняются уже
    готовые формы
     */


    private RecyclerView mTopList; // m - обозначает что переменная приватная

    private RecyclerView mainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> images =  new ArrayList<>();                    // Создание списка картинок - идентефикаторов картинок
        images.add(R.drawable.top_banner1);
        images.add(R.drawable.top_banner2);

        mTopList = findViewById(R.id.top_list);                            // Привязка списка к разметке
        mainList = findViewById(R.id.main_list);

        TopAdapter topAdapter = new TopAdapter(this, images);      // Назначили адаптер и картинки

        mTopList.setLayoutManager(new LinearLayoutManager(this,   // Способ отображения элементов - горизонтальный список
                LinearLayoutManager.HORIZONTAL, false));

        mTopList.setAdapter(topAdapter);

        ArrayList<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza(R.drawable.pizza1, "Ветчина с грибами","Ветчина, шампиньоны," +
                "увеличенная порция Моцареллы, томатный соус", 345));
        pizzas.add(new Pizza(R.drawable.pizza2, "Баварские колбаски","Баварские колбаски, " +
                "пикантный пеперонни, острый Чориззо, томатный соус", 345));
        pizzas.add(new Pizza(R.drawable.pizza2, "Нежный лосось","Лосось, оливки," +
                "томаты, соус песто", 345));

        MainAdapter mainAdapter = new MainAdapter(this, pizzas);   // Создаем адаптер для связи пиц и списка
        mainList.setAdapter(mainAdapter);                                 // Назначаем адаптер списку
        mainList.setLayoutManager(new LinearLayoutManager(this));  // Указываем как ьудут располгаться элементы списка



    }
}