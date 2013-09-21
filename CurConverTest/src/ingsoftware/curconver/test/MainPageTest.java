package ingsoftware.curconver.test;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import ingsoftware.curconver.MainPage;
import ingsoftware.curconver.R;

public class MainPageTest extends ActivityInstrumentationTestCase2<MainPage> {

	//global variables
	public Activity activity;
	public Button bttConvert;
	public Button bttFrom;
	public Button bttTo;
	public TextView tvFrom;
	public TextView tvTo;
	public EditText txtFrom;
	public EditText txtTo;
	
	public MainPageTest() {

		super(MainPage.class);
	}

	public void setUp() throws Exception {
		super.setUp();
		//This allows to execute activities over the GUI
		setActivityInitialTouchMode(true);
		//component initialization 
		activity = getActivity();
		bttConvert = (Button)activity.findViewById(R.id.bttConvert);
		bttFrom = (Button)activity.findViewById(R.id.bttFrom);
		bttTo = (Button)activity.findViewById(R.id.bttTo);
		tvFrom = (TextView)activity.findViewById(R.id.tvFrom);
		tvTo = (TextView)activity.findViewById(R.id.tvTo);
		txtFrom = (EditText)activity.findViewById(R.id.txtFromBox);
		txtTo = (EditText)activity.findViewById(R.id.txtToBox);
		
	}
	
	//to verify non-nullity of each initialized component
	public void testPreconditions(){
		
		assertNotNull(activity);
		assertNotNull(bttConvert);
		assertNotNull(bttTo);
		assertNotNull(tvFrom);
		assertNotNull(tvTo);
		assertNotNull(txtFrom);
		assertNotNull(txtTo);
	
	}
	
	//---------To test that strings and not hard-coded-----------
	public void testRefBttConvert(){
		final String txt = activity.getString(R.string.bttConvert);
		assertEquals(txt, bttConvert.getText().toString());
		
	}
	
	public void testRefFromButton(){
		final String bttText = activity.getString(R.string.bttDefaultFrom);
		assertEquals(bttText, bttFrom.getText().toString());
	}
	
	public void testRefToButton(){
		final String bttText = activity.getString(R.string.bttDefaultTo);
		assertEquals(bttText, bttTo.getText().toString());
	}
	//------------End Hard-Coded Test -----------------------------
	
	//----------------Button Action Tests --------------------------
	
	public void testTextToButton(){
		TouchUtils.clickView(this, bttConvert);
		//TODO
		// assertEquals("",txtFrom.getText().toString());
	}
	
		
	//------------End Button Action Tests---------------------------
}
