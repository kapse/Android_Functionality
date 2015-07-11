package login.com.login;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String message = extras.getString(MainActivity.EXTRA_MESSAGE);
     //   String message2 = extras.getString(MainActivity.EXTRA_MESSAGE1);
        //LinearLayout ll = new LinearLayout(this);
        //ll.setOrientation(LinearLayout.VERTICAL);
        TextView textView = new TextView(this);
        textView.setTextSize(30);
        textView.setText(message);
      //  textView.append(message);

        //TextView textView2 = new TextView(this);
        //textView2.setTextSize(40);
        //textView2.append(message2);
        //ll.addView(textView);
        //ll.addView(textView2);

        setContentView(textView);
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
