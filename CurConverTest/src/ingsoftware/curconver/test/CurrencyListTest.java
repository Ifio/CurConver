package ingsoftware.curconver.test;

import ingsoftware.curconver.CurrencyList;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;
import ingsoftware.curconver.R;

public class CurrencyListTest extends ActivityInstrumentationTestCase2<CurrencyList>{
	
	Activity activity;
	ListView lv;
	
	public CurrencyListTest(){
		super(CurrencyList.class);
	}
	
	public void setUp() throws Exception {
		super.setUp();
		//This allows to execute activities over the GUI
		setActivityInitialTouchMode(true);
		activity = getActivity();
		lv = (ListView)activity.findViewById(R.id.listView);
		
	}
	
	// Test for non nullified elements
	
	public void NonNullElements(){
		assertNotNull(lv);
	}
	
	//Test for hard-coded strings
	
	public void testName(){
		
	}
}
