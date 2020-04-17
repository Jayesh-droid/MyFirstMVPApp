package com.example.myfirstmvpapp;

public interface MainView {

    //to show progress bar
    void showProgress();

    //to hide progress bar
    void hideProgress();

    //set the random string on the textView.
    void setQuote(String string);

}
