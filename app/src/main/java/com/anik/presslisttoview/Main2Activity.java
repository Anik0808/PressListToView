package com.anik.presslisttoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView name= (TextView) findViewById(R.id.text);

        Bundle bd = getIntent().getExtras();
        if (bd != null) {
            String getName = (String) bd.get("name");
            name.setText(getName);
        }
    }
}
