package dialog.com.dialog;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SixthActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }
    public void home(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
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
    }public void courses(View view)
    {
        Intent intent=new Intent(this,FourthActivity.class);
        startActivity(intent);
    }public void interests(View view)
    {
        Intent intent=new Intent(this,FifthActivity.class);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sixth, menu);
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
