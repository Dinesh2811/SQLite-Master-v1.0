package com.dinesh.sqlite.test.android_lifecycle.View_model;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.dinesh.sqlite.R;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "log_" + getClass().getName().split(getClass().getName().split("\\.")[2] + ".")[1];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_main);
        TextView mTextView = findViewById(R.id.tvNumber);

        //  ViewModel
//        MainViewModel myData = new MainViewModel();
        MainViewModel myData = new ViewModelProvider(this).get(MainViewModel.class);
        String myRandomNumber = myData.getNumber();
        mTextView.setText(myRandomNumber);

        Log.i(TAG, "Random Number Set");

    }
}
