package dialog.com.activityforresults;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    private static final int REQUEST_CODE_NAME=0;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput=(TextView)findViewById(R.id.tvOutput);
    }

    public void setName(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,REQUEST_CODE_NAME);
    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==REQUEST_CODE_NAME)
        {
            if(resultCode==RESULT_OK)
            {
                String name=data.getStringExtra("name");
                tvOutput.setText("Wecome back "+name);
            }
        }
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
