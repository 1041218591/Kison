package net.kiseon.kison;

import org.apache.http.client.HttpClient;

import android.app.Activity;
import android.content.pm.FeatureInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {
	private EditText username;
	private EditText password;
	private Button login;
	private Button cancel;
	private OnClickListener  Listenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//Òþ²Ø±êÌâÀ¸
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login_button);
        cancel = (Button)findViewById(R.id.cancel);
        Listenter = new ButtonListenter();
        login.setOnClickListener(Listenter);
        
    }
    
    class ButtonListenter implements OnClickListener{
    	@Override
    	public void onClick(View v) {
    		Thread t = new NetWork_login();
    		t.start();
    	}
    }
    
    class NetWork_login extends Thread{
    	@Override
    	public void run(){
    		
    		try {
				
			} catch (Exception e) {

			}
    	}
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
