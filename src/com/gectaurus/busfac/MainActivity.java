package com.gectaurus.busfac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button fac = (Button) findViewById(R.id.button2);
        final Button alu = (Button) findViewById(R.id.button1);
        
        OnClickListener ocl = new OnClickListener(){
        	@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
        		Intent intent = new Intent(MainActivity.this, SecondActivity.class);        		
        		
        		if(arg0.equals(fac)){
        			intent.putExtra("title", "Destino: Facultad");
        			intent.putExtra("image", "desfac.png");
        		}
        		else{
        			intent.putExtra("title", "Destino: Aluche");
        			intent.putExtra("image", "desalu.png");
          		}
        		
        		MainActivity.this.startActivity(intent);
			}
		};                
                       
        fac.setOnClickListener(ocl);		        
        alu.setOnClickListener(ocl);
        
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
