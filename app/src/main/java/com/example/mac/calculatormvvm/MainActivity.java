package com.example.mac.calculatormvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mac.calculatormvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityVM viewmodel = new MainActivityVM(this, binding);
        binding.setView(this);
        binding.setViewmodel(viewmodel);
    }
}
