package com.example.note.presenter;

import android.util.Log;

import com.example.note.model.Model;
import com.example.note.view.ViewInterface;
import com.example.note.view.MainActivity;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class Presenter implements ViewInterface.Presenter {

    private ViewInterface.MainActivity view;
    private Model model;


    public Presenter(MainActivity view) {
       this.model = new Model();
       this.view = view;
    }

    public void save(String s) {
        model.save(view.getText());
        view.putText(s);
        view.showToast();
    }


    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");
    }

}
