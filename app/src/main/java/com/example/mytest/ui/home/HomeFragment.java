package com.example.mytest.ui.home;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.*;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import com.example.mytest.R;
import com.example.mytest.SettingsContainer;

public class HomeFragment extends Fragment {


    private static EditText editText;
    private static TextView textView;
    private static SettingsContainer sc = SettingsContainer.getInstance();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        textView = root.findViewById(R.id.textView);
        editText = root.findViewById(R.id.editTextT);
        textView.setText(sc.getViewText());
        editText.setText(sc.getEditText());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sc.getFontSize());
        textView.setMaxWidth(sc.getWidth()); //TODO Ei toimi oikein
        textView.setMaxHeight(sc.getHeight()); //TODO Ei toimi oikein
        textView.setLines(sc.getRows());
        TextView fromSettings = root.findViewById(R.id.textViewFromSettings);
        fromSettings.setText(sc.getSettingsText());
        fromSettings.setText(sc.getSettingsText());
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View root, int keyCode, KeyEvent event) {
                sc.setEditText(editText.getText().toString());
                return false;
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setEnabled(sc.getEditAllowed());
            }
        });
        return root;
    }


    public static void setEdit() {
        editText.setEnabled(sc.getEditAllowed());
        if (!sc.getEditAllowed()){
            textView.setText(editText.getText().toString());
            sc.setViewText(editText.getText().toString());
        }
    }

}