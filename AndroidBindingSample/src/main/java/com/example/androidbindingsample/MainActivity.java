package com.example.androidbindingsample;

import android.os.Bundle;
import gueei.binding.Binder;
import gueei.binding.app.BindingActivity;

public class MainActivity extends BindingActivity {
    private BMIViewModel viewModel = new BMIViewModel();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Binder.init(this.getApplication());
        setAndBindRootView(R.layout.activity_main, viewModel);
    }
}
