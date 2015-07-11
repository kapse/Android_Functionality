package dialog.com.smsappdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

import java.util.Objects;

/**
 * Created by VAIBHAV on 4/30/2015.
 */
public class SMSReceiver extends BroadcastReceiver {

    public void onReceive(Context context,Intent intent)
    {
        Bundle extras=intent.getExtras();
        SmsMessage[] messages=null;
        String senderNumber="";
        String msgBody="";

        if(extras!=null)
        {
            Object[]pdus=(Object[])extras.get("pdus");
            messages=new SmsMessage[pdus.length];

            for(int i=0;i<messages.length;i++)
            {
                messages[i]=SmsMessage.createFromPdu((byte[])pdus[i]);

                if(i==0)
                {
                    senderNumber=messages[i].getOriginatingAddress();
                }
                msgBody+=messages[i].getMessageBody();
            }
            Toast.makeText(context,"SMS received from:"+senderNumber+"\nSMS content:"+msgBody,Toast.LENGTH_LONG).show();
        }
    }
}
