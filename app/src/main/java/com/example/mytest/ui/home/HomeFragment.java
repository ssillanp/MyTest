package com.example.mytest.ui.home;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import com.example.mytest.R;

public class HomeFragment extends Fragment {


    private static EditText editText;
    private static TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        textView = root.findViewById(R.id.text_home);
        editText = root.findViewById(R.id.editTextT);
        return root;
    }

    public static void setTextEditable(boolean setting) {
        editText.setEnabled(setting);
        if (!setting) {
            textView.setText(editText.getText().toString());
        }
    }
}