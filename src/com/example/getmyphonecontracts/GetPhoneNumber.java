package com.example.getmyphonecontracts;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.Log;

public class GetPhoneNumber {
	public static List<PhoneInfo> list = new ArrayList<PhoneInfo>();
	public static String getNumber(Context context){
	
		
		Cursor cursor = context.getContentResolver().query(Phone.CONTENT_URI, null, null, null, null);
	
		String phoneNumber;
	
		String phoneName;
	

	
	
	while(cursor.moveToNext()){
	phoneName = cursor.getString(cursor.getColumnIndex(Phone.DISPLAY_NAME));
	phoneNumber = cursor.getString(cursor.getColumnIndex(Phone.NUMBER));
	PhoneInfo  phoneInfo = new PhoneInfo(phoneName, phoneNumber);
	list.add(phoneInfo);
	Log.d("GetPhoneNumber",phoneName + phoneNumber);
	}
	
	
	
	
	return null;
	}

}
