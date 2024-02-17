package com.to.section4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Listview extends AppCompatActivity {
    ListView listview;
    ArrayList<HashMap<String, String>> arrayList;
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listview = findViewById(R.id.listview);



        arrayList = new ArrayList<>();
        hashMap = new HashMap<>();
        hashMap.put("title", "deb");
        hashMap.put("body", "karmokar");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "srity");
        hashMap.put("body", "roy");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "taposh");
        hashMap.put("body", "dada");
        arrayList.add(hashMap);

        Myadapter myadapter = new Myadapter();
        listview.setAdapter(myadapter);

    }

    private class Myadapter extends BaseAdapter {


        LayoutInflater layoutInflater;
        ImageView imageView;
        TextView textView1, textView2;

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view1 = layoutInflater.inflate(R.layout.sublay, viewGroup, false);

            imageView = view1.findViewById(R.id.imageView);
            textView1 = view1.findViewById(R.id.textView1);
            textView2 = view1.findViewById(R.id.textView2);
            HashMap<String, String> hashMap1 = arrayList.get(i);
//            String title = hashMap1.get("title");
//            String body = hashMap1.get("body");
//            textView1.setText("" + body);
//            textView2.setText("" + title);

            textView1.setText("" +hashMap1.get("title"));
            textView2.setText("" + hashMap1.get("body"));

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(Listview.this, "This is " + hashMap1.get("title") + i, Toast.LENGTH_SHORT).show();
                }
            });
            return view1;
        }
    }
}