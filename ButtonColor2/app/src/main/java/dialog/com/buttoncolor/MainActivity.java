package dialog.com.buttoncolor;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.oneA);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();

            }
        });
        b2=(Button)findViewById(R.id.oneB);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.oneB)
                {
                    Button btn = (Button)findViewById(R.id.oneB);
                    btn.setEnabled(false);

                }
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });
        b3=(Button)findViewById(R.id.oneC);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+1;
                b3.setBackgroundColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "Right Answer! Your score is "+score, Toast.LENGTH_SHORT).show();

            }
        });
        b4=(Button)findViewById(R.id.oneD);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score-1;
                b4.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });
        b5=(Button)findViewById(R.id.twoA);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });
        b7=(Button)findViewById(R.id.twoC);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });
        b6=(Button)findViewById(R.id.twoB);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score=score+2;
                b6.setBackgroundColor(Color.GREEN);
                Toast.makeText(MainActivity.this, "Right Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });
        b8=(Button)findViewById(R.id.twoD);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setBackgroundColor(Color.RED);
                Toast.makeText(MainActivity.this, "Wrong Answer! Your score is "+score, Toast.LENGTH_SHORT).show();
            }
        });



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
