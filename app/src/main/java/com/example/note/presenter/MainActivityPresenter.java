package com.example.note.presenter;

import com.example.note.model.Model;
import com.example.note.view.View;

public class MainActivityPresenter {

    private View view;
    private Model model;


    public MainActivityPresenter(View view) {
       this.model = new Model();
       this.view = view;
    }

    public static void save() {
    }
}