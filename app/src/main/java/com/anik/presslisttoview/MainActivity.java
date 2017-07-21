package com.anik.presslisttoview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Object> list;
    static final String[] NAME= new String[]{
            "Rezwan","Ruha","Suhit","Pantho","Suma","Sakib","Ahsan","Minhaj","Amit"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView)findViewById(R.id.list);

        list = new ArrayList<>();

        for(int count=0;count<NAME.length;count++){
            list.add(NAME[count]);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,NAME);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplication(),Main2Activity.class);
                intent.putExtra("name", ((TextView) view).getText().toString());

                startActivity(intent);

            }
        });
    }
}
