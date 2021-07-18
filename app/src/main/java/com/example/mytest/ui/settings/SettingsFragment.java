package com.example.mytest.ui.settings;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.*;
import com.example.mytest.R;
import com.example.mytest.SettingsContainer;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class SettingsFragment extends Fragment {

    private SettingsContainer sc = SettingsContainer.getInstance();
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_settings, container, false);
        SeekBar fontSize = root.findViewById(R.id.seekBarFontSize);
        SeekBar width = root.findViewById(R.id.seekBarWidth);
        SeekBar height = root.findViewById(R.id.seekBarHeight);
        SeekBar rows = root.findViewById(R.id.seekBarRows);
        Spinner Language = root.findViewById(R.id.spinnerLanguage);
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Suomi");
        languages.add("Svenska");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, languages);
        Language.setAdapter(adapter);
        EditText textToDisplay = root.findViewById(R.id.editTextToDisplay);
        fontSize.setProgress((int) sc.getFontSize());
        width.setProgress(sc.getWidth());
        height.setProgress(sc.getHeight());
        rows.setProgress(sc.getRows());
        TextView fontSizeMonitor = root.findViewById(R.id.textViewFonSizeMon);
        TextView widthMonitor = root.findViewById(R.id.textViewWidthMon);
        TextView heightMonitor = root.findViewById(R.id.textViewHeightMon);
        TextView rowsMonitor = root.findViewById(R.id.textViewRowsMon);
        fontSizeMonitor.setText(String.valueOf((int) sc.getFontSize()));
        widthMonitor.setText(String.valueOf(sc.getWidth()));
        heightMonitor.setText(String.valueOf(sc.getHeight()));
        rowsMonitor.setText(String.valueOf(sc.getRows()));
        textToDisplay.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                sc.setSettingsTextToDisplay(textToDisplay.getText().toString());
                return false;
            }
        });


        SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sc.setFontSize(fontSize.getProgress());
                sc.setWidth(width.getProgress());
                sc.setHeight(height.getProgress());
                sc.setRows(rows.getProgress());
                fontSizeMonitor.setText(String.valueOf((int) sc.getFontSize()));
                widthMonitor.setText(String.valueOf(sc.getWidth()));
                heightMonitor.setText(String.valueOf(sc.getHeight()));
                rowsMonitor.setText(String.valueOf(sc.getRows()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };



        fontSize.setOnSeekBarChangeListener(listener);
        width.setOnSeekBarChangeListener(listener);
        height.setOnSeekBarChangeListener(listener);
        rows.setOnSeekBarChangeListener(listener);

        return root;
    }





}