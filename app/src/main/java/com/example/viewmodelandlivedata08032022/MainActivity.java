package com.example.viewmodelandlivedata08032022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewmodelandlivedata08032022.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBinding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mBinding.getRoot());
        if(savedInstanceState!=null)
        {
            text=savedInstanceState.getString("text");
            mBinding.textView.setText(text);
        }
        mBinding.buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text="Xin Chao";
                mBinding.textView.setText(text);
            }
        });


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",text);

    }
}