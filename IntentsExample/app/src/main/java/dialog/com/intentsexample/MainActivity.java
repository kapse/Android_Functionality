package dialog.com.intentsexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browseWeb(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void showMap(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:26.934,-80.106"));
        startActivity(intent);
    }
    public void makeCall(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-518-253-3051"));
        startActivity(intent);
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
