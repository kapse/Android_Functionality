package login.com.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public final static String EXTRA_MESSAGE ="";
    public final static String EXTRA_MESSAGE1 ="";
    public void buttonOnClick(View v){
        Button button=(Button) v;
        Intent intent = new Intent(this, MainActivity2.class);
        Bundle extras = new Bundle();
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String message2 = editText2.getText().toString();
        String name="";
        String pas="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dsn","root","1234@vaibhav");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from userr");
            while(rs.next())
            {
                name=rs.getString("username");
                pas=rs.getString("password");
                if(message.equals(name) && message2.equals(pas))
                {
                    extras.putString(EXTRA_MESSAGE, "First Name is :"+message+" Nationality is :"+message2);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                else {
                    String msg = "username ";
                    String msg1 = "password";
                    extras.putString(EXTRA_MESSAGE, "Invalid " + msg + " and " + msg1);
                    intent.putExtras(extras);
                    startActivity(intent);
                }


            }
        }
        catch(Exception w)
        {
            System.out.println(w);
        }

        /*if(message.equals("fbi") && message2.equals("uk"))
        {
            extras.putString(EXTRA_MESSAGE, "First Name is :"+message+" Nationality is :"+message2);
            //  extras.putString(EXTRA_MESSAGE1, message2);
            intent.putExtras(extras);
            startActivity(intent);
        }
        else
        {
            String msg="username ";
            String msg1="password";
            extras.putString(EXTRA_MESSAGE, "Invalid "+msg+" and "+msg1);
            //  extras.putString(EXTRA_MESSAGE1, message2);
            intent.putExtras(extras);
            startActivity(intent);
        }*/


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
