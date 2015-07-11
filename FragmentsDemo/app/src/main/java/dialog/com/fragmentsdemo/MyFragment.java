package dialog.com.fragmentsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VAIBHAV on 4/23/2015.
 */
public class MyFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        View view=inflater.inflate(R.layout.my_frag,null,false);
        return view;
    }
}
