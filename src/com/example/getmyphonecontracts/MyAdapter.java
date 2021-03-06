package com.example.getmyphonecontracts;

import java.util.List;
import java.util.zip.Inflater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	
	private List<PhoneInfo> list;
	private Context context;
	private LinearLayout layout;

	
	
	public MyAdapter(List<PhoneInfo> list,Context context) {
		this.list = list;
		
		this.context = context;
		
	}

	@Override
	public int getCount() {
		
		return list.size();
	}

	@Override
	public Object getItem(int position) {
	
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		/*LayoutInflater inflater = LayoutInflater.from(context);
		layout = (LinearLayout) inflater.inflate(R.layout.adapter, null);
		TextView name = (TextView) layout.findViewById(R.id.name);
		TextView number = (TextView)layout.findViewById(R.id.number);
		name.setText(list.get(position).getName());
		number.setText(list.get(position).getNumber()); */
		ViewHolder holder;
		if(convertView == null){
			holder = new ViewHolder();
			convertView= LayoutInflater.from(context).inflate(R.layout.adapter, null);
			holder.name = (TextView)convertView.findViewById(R.id.name);
			holder.number = (TextView) convertView.findViewById(R.id.number);
			holder.name.setText(list.get(position).getName());
			holder.number.setText(list.get(position).getNumber());
			convertView.setTag(holder);
		}
		else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		
		
		return convertView;
	}
	
	public static class ViewHolder{
		
		TextView number;
		TextView name ;
		
		
	}

}
