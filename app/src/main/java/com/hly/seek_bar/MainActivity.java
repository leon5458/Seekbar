package com.hly.seek_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar seekBar;
    private TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(this);

    }

    // 数值改变
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        tv1.setText("正在拖动");
        tv2.setText("当前值:"+ progress );
    }

    // 开始拖动
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
       tv1.setText("开始拖动");
    }

    // 停止拖动
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        tv1.setText("停止拖动");
    }
}
