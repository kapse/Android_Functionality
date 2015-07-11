package dialog.com.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private final String TAG="ActivityLifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate() called");
    }
    public void summary(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    public void skills(View view)
    {
        Intent intent=new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }
    public void courses(View view)
    {
        Intent intent=new Intent(this,FourthActivity.class);
        startActivity(intent);
    }public void interests(View view)
    {
        Intent intent=new Intent(this,FifthActivity.class);
        startActivity(intent);
    }public void contact(View view)
    {
        Intent intent=new Intent(this,SixthActivity.class);
        startActivity(intent);
    }




    public void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart() called");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart() called");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop() called");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
