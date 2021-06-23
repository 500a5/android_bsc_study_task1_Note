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

    public void save() {
        model.save(view.getText());
        view.showToast();

    }
}