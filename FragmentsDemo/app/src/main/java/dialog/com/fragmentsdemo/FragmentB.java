package dialog.com.fragmentsdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VAIBHAV on 4/24/2015.
 */
public class FragmentB extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {

        View view=inflater.inflate(R.layout.fragment_b,null,false);
        return view;
    }
}
