package com.example.mytest.ui.settings;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.SeekBar;
import android.widget.TextView;
import com.example.mytest.R;
import com.example.mytest.SettingsContainer;

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
        fontSize.setProgress((int) sc.getFontSize());
        width.setProgress(sc.getWidth());
        height.setProgress(sc.getHeight());
        rows.setProgress(sc.getRows());


        SeekBar.OnSeekBarChangeListener listener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sc.setFontSize(fontSize.getProgress());
                sc.setWidth(width.getProgress());
                sc.setHeight(height.getProgress());
                sc.setRows(rows.getProgress());
//                fontSizeMonitor.setText((int) sc.getFontSize());
//                widthMonitor.setText((int) sc.getWidth());
//                heightMonitor.setText((int) sc.getHeight());
//                rowsMonitor.setText((int) sc.getRows());
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