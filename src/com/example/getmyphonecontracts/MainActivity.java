package com.example.getmyphonecontracts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listView;
	private MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		GetPhoneNumber.getNumber(this);
		listView = (ListView) findViewById(R.id.list_view);
		adapter = new MyAdapter(GetPhoneNumber.list, this);
		listView.setAdapter(adapter);
		
	}

	
}
