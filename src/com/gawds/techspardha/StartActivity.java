package com.gawds.techspardha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;

public class StartActivity extends Activity {
	SessionManager session;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  try {
		  PackageInfo info = getPackageManager().getPackageInfo("com.gawds.techspardha", PackageManager.GET_SIGNATURES);
		  for (Signature signature : info.signatures) {
		      MessageDigest md = MessageDigest.getInstance("SHA");
		      md.update(signature.toByteArray());
		      Log.e("MY KEY HASH:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
		  }
		  } catch (NameNotFoundException e) {

		  } catch (NoSuchAlgorithmException e) {

		  }
      new Handler().postDelayed(new Runnable() {
    	  
          @Override
          public void run() {
        	  session = new SessionManager(getApplicationContext()); 
        	  if(session.isLoggedIn())
        	  {
        		  Intent i=new Intent(StartActivity.this,LoginSplashActivity.class);
        		  startActivity(i);
        		  finish();
        	  }
        	  else
        	  {
        		  Intent i=new Intent(StartActivity.this,MidActivity.class);
        		  startActivity(i);
        		  finish();
        	  }  
          }
      }, 3000);
      
      
      
      
	 
	 }
}