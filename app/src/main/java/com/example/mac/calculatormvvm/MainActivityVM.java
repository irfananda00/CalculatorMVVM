package com.example.mac.calculatormvvm;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.example.mac.calculatormvvm.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 4/2/18.
 */

public class MainActivityVM extends BaseObservable{

    public final ObservableField<String> text = new ObservableField<>();
    public final ObservableField<String> value = new ObservableField<>();
    private Context context;
    private ActivityMainBinding binding;
    private Calculator calculator;

    public MainActivityVM(Context context, ActivityMainBinding binding) {
        this.context = context;
        this.binding = binding;
        calculator = new Calculator();
        text.set("");
    }

    public void type9(){
        if (text.get().equals("")) {
            text.set("9");
        }else{
            text.set(text.get()+"9");
        }
    }

    public void type8(){
        if (text.get().equals("")) {
            text.set("8");
        }else{
            text.set(text.get()+"8");
        }
    }

    public void type7(){
        if (text.get().equals("")) {
            text.set("7");
        }else{
            text.set(text.get()+"7");
        }
    }

    public void type6(){
        if (text.get().equals("")) {
            text.set("6");
        }else{
            text.set(text.get()+"6");
        }
    }

    public void type5(){
        if (text.get().equals("")) {
            text.set("5");
        }else{
            text.set(text.get()+"5");
        }
    }

    public void type4(){
        if (text.get().equals("")) {
            text.set("4");
        }else{
            text.set(text.get()+"4");
        }
    }

    public void type3(){
        if (text.get().equals("")) {
            text.set("3");
        }else{
            text.set(text.get()+"3");
        }
    }

    public void type2(){
        if (text.get().equals("")) {
            text.set("2");
        }else{
            text.set(text.get()+"2");
        }
    }

    public void type1(){
        if (text.get().equals("")) {
            text.set("1");
        }else{
            text.set(text.get()+"1");
        }
    }

    public void type0(){
        if (!text.get().equals("")) {
            text.set(text.get()+"0");
        }
    }

    public void equals(){
        if (calculator.isOperatorExist(text.get())){
            value.set(calculator.doFormula(text.get())+"");
        }
    }

    public void delete(){
        text.set("");
        value.set("");
        calculator.reset();
    }

    public void divide(){
        equals();
        if (!text.get().equals("")) {
            text.set(text.get()+"÷");
        }
    }

    public void multiply(){
        equals();
        if (!text.get().equals("")) {
            text.set(text.get()+"x");
        }
    }

    public void substract(){
        equals();
        if (!text.get().equals("")) {
            text.set(text.get()+"-");
        }
    }

    public void add(){
        equals();
        if (!text.get().equals("")) {
            text.set(text.get()+"+");
        }
    }
}
