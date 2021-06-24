package com.example.note.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;

import com.example.note.R;
import com.example.note.model.Model;
import com.example.note.presenter.MainActivityPresenter;

public class View extends AppCompatActivity {

    private  EditText editText;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        presenter = new MainActivityPresenter(this);


        editText = (EditText) findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.save();
            }
        });
    }
    public void showToast() {
        Toast.makeText(this, "Данные сохранены", Toast.LENGTH_SHORT).show();
    }

    public String getText(){
        Editable text = editText.getText();
        return text.toString();
    }
    public void putText(String s){
         editText.setText(s);
    }
}