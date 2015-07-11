package dialog.com.button;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.graphics.Color;
import android.widget.Toast;


public class MainActivity extends Activity {
    Button[] btns;
    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] btns = new Button[8];

        btns[0] = (Button) findViewById(R.id.oneA);
        btns[1] = (Button) findViewById(R.id.oneB);
        btns[2] = (Button) findViewById(R.id.oneC);
        btns[3] = (Button) findViewById(R.id.oneD);
        btns[4] = (Button) findViewById(R.id.twoA);
        btns[5] = (Button) findViewById(R.id.twoB);
        btns[6] = (Button) findViewById(R.id.twoC);
        btns[7] = (Button) findViewById(R.id.twoD);

        for (int i = 0; i < 9; i++) {

            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(v.getId() == R.id.oneA)
                    {
                        Button btn = (Button)findViewById(R.id.oneA);
                        btn.setEnabled(false);

                    }
                    if(v.getId() == R.id.oneB)
                    {
                        Button btn = (Button)findViewById(R.id.oneB);
                        btn.setEnabled(false);

                    } if(v.getId() == R.id.oneC)
                    {
                        Button btn = (Button)findViewById(R.id.oneC);
                        btn.setEnabled(false);

                    } if(v.getId() == R.id.oneD)
                    {
                        Button btn = (Button)findViewById(R.id.oneD);
                        btn.setEnabled(false);

                    } if(v.getId() == R.id.twoA)
                    {
                        Button btn = (Button)findViewById(R.id.twoA);
                        btn.setEnabled(false);

                    } if(v.getId() == R.id.twoB)
                    {
                        Button btn = (Button)findViewById(R.id.twoB);
                        btn.setEnabled(false);

                    } if(v.getId() == R.id.twoC)
                    {
                        Button btn = (Button)findViewById(R.id.twoC);
                        btn.setEnabled(false);

                    }
                    if(v.getId() == R.id.twoD)
                    {
                        Button btn = (Button)findViewById(R.id.twoD);
                        btn.setEnabled(false);

                    }

                }
            });

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
