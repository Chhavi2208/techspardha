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
import android.webkit.WebView;
import android.widget.TextView;
 
public class GuestLectures extends Fragment {
     
    public GuestLectures(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
        
        WebView mWebView = (WebView)rootView.findViewById(R.id.txtLabel); 
        mWebView.getSettings();
        mWebView.setBackgroundColor(0x161616);
        final String mimeType = "text/html";
        final String encoding = "UTF-8";
       String text = "<html><body>"
                + "<p align=\"justify\" style=\"color:white; background-color:#161616;\">"                
                + "This brings to NIT Kurukshetra notable industry experts to interact and guide the students. These interactions bring together students to work towards a better tomorrow. Notable speakers from last year include Mr Shailesh Rao, former MD, Google India; Mrs Ihitashri Shandilya, former CEO, Mithilasmita.com and many others." 
                 + "</p> "
                 + "</body></html>";
        mWebView.loadDataWithBaseURL("", text, mimeType, encoding, "");
    
        
        TextView evdet=(TextView)rootView.findViewById(R.id.txtLabel6);
        evdet.setOnClickListener(new OnClickListener() {
        	
            @Override
          public void onClick(View view) {
           //Toast.makeText(EventsMainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            	try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+"9802917745"));
                    startActivity(callIntent);
                } catch (ActivityNotFoundException activityException) {
                    Log.e("dialing-example", "Call failed", activityException);
                }
            }
});
        
        
        TextView evdet2=(TextView)rootView.findViewById(R.id.txtLabel6);
        evdet2.setOnClickListener(new OnClickListener() {
        	
            @Override
          public void onClick(View view) {
           //Toast.makeText(EventsMainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            	try {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+"9416380744"));
                    startActivity(callIntent);
                } catch (ActivityNotFoundException activityException) {
                    Log.e("dialing-example", "Call failed", activityException);
                }
            }
});
        return rootView;
    }
}