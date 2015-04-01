package com.glj.ieye;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void StartMusic(View view) {
	    Intent intent2 = new Intent(MainActivity.this,yypService.class);  
	    startService(intent2);  
	}
	public void BackTo(View view) {
		  Intent intent1 = new Intent(MainActivity.this,yypService.class);  
		  stopService(intent1);
		  this.finish();
	}
	
	public void chakan1(View view) {
		Intent intent3 =new Intent(this,Result.class);
		startActivity(intent3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
