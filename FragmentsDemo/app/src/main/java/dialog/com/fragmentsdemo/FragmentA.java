package dialog.com.fragmentsdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VAIBHAV on 4/24/2015.
 */
public class FragmentA extends Fragment {

    private static final String TAG="FragmentLifeCycle";
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        Log.d(TAG,"onAttach() called");
    }
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate() called");
    }
     public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        Log.d(TAG,"onCreateView() called");
        View view=inflater.inflate(R.layout.fragment_a,null,false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"onActivityCreated() called");
    }
    public void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart() called");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume() called");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause() called");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop() called");
    }
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d(TAG,"onDestroyView() called");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy() called");
    }
    public void onDetach()
    {
        super.onDetach();
        Log.d(TAG,"onDetach() called");
    }

}
