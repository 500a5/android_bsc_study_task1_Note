package com.example.note.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.IInterface;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;

import com.example.note.R;
import com.example.note.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements ViewInterface.MainActivity {

    private  EditText editText;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        presenter = new Presenter(this);


        editText = (EditText) findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.save(getText());
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