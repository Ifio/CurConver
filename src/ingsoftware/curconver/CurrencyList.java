package ingsoftware.curconver;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class CurrencyList extends ListActivity {
	ArrayList<String> currencyHolder = new ArrayList<String>();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//ListView listView = (ListView)findViewById(R.id.listView);
		currencyHolder.add("Colombian Peso");
		currencyHolder.add("Chilean Peso");
		currencyHolder.add("US Dollar");
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_gallery_item, currencyHolder);
		setListAdapter(adapter);
   }
	
	public void feedList(String currency){
		currencyHolder.add(currency);
	}
	
	public void selectItem(View v){
		
		Toast.makeText(v.getContext(), "hi", Toast.LENGTH_LONG).show();
	}
	
}
