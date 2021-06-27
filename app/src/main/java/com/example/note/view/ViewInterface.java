package com.example.note.view;

public interface ViewInterface {
     interface Presenter{
          void save(String s);
          void onDestroy();
     }

     interface MainActivity{
          void showToast();
          void putText(String s);
          String getText();
     }

     interface Model{
          void save(String text);
     }
}
