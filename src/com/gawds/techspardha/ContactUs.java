package com.gawds.techspardha;
 
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class ContactUs extends Fragment {
     
    public ContactUs(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_whatshot, container, false);
        TextView evdet=(TextView)rootView.findViewById(R.id.txtLabel6);
 evdet.setOnClickListener(new OnClickListener() {
        	
            @Override
          public void onClick(View view) {
           //Toast.makeText(EventsMainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            	try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+"7206549590"));
                    startActivity(callIntent);
                } catch (ActivityNotFoundException activityException) {
                    Log.e("dialing-example", "Call failed", activityException);
                }
            }
});
        
        
        TextView evdet2=(TextView)rootView.findViewById(R.id.TextView02);
        evdet2.setOnClickListener(new OnClickListener() {
        	
            @Override
          public void onClick(View view) {
           //Toast.makeText(EventsMainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            	try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+"9802229395"));
                    startActivity(callIntent);
                } catch (ActivityNotFoundException activityException) {
                    Log.e("dialing-example", "Call failed", activityException);
                }
            }
}); 
        TextView evdet3=(TextView)rootView.findViewById(R.id.TextView03);
        evdet3.setOnClickListener(new OnClickListener() {
        	
            @Override
          public void onClick(View view) {
           //Toast.makeText(EventsMainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            	try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+"8950494606"));
                    startActivity(callIntent);
                } catch (ActivityNotFoundException activityException) {
                    Log.e("dialing-example", "Call failed", activityException);
                }
            }
}); 
        return rootView;
    }
}