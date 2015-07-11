package dialog.com.framelayoutdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void aron(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+1-518-253-3051"));
        startActivity(intent);
    }
    public void albert(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-514-553-8851"));
        startActivity(intent);
    }
    public void alexis(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-458-583-5454"));
        startActivity(intent);
    }
    public void ben(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-666-873-6632"));
        startActivity(intent);
    }
    public void brandon(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-333-956-6458"));
        startActivity(intent);
    }
    public void chris(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-555-412-5325"));
        startActivity(intent);
    }
    public void hospital(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-555"));
        startActivity(intent);
    }
    public void police(View view)
    {
        Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+1-900"));
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
