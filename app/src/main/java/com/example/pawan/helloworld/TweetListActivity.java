package com.example.pawan.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TweetListActivity extends Activity {
    private ListView tweetListView;
    private String[] StringArray;
    private ArrayAdapter tweetItemArrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);
    StringArray=new String[10];
        for(int i=0;i<10;i++)
        {
            StringArray[i]="String" + i;
        }
        tweetItemArrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,StringArray);
        tweetListView=(ListView) findViewById(R.id.tweetList);
        tweetListView.setAdapter(tweetItemArrayAdapter);
    }

}
