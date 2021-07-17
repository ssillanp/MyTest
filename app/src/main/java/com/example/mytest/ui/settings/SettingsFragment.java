package com.example.mytest.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.example.mytest.R;
import com.example.mytest.ui.home.HomeFragment;

public class SettingsFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        EditText fontSize = root.findViewById(R.id.editTextFontSize);
        EditText width = root.findViewById(R.id.editTextWidth);
        EditText height = root.findViewById(R.id.editTextHeight);
        EditText rows = root.findViewById(R.id.editTextRows);

        return root;
    }
}