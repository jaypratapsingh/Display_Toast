package com.jp.plugin.display_toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import java.io.File;

public class Display_Toast extends CordovaPlugin {


		@Override
		public boolean execute(String actionString, String message, CallbackContext callbackContext)
		{
			try
			{
				String getMessage=message.replace('"', ' ');

				if(actionString.equalsIgnoreCase("Toast_method_called")){
					android.widget.Toast.makeText(cordova.getActivity(), getMessage, android.widget.Toast.LENGTH_LONG).show();
					callbackContext.success("success");
					return true;
				}
				else{
					callbackContext.error("Invalid Selection");
					return false;
				}
			}
			catch(Exception e){
				Log.e(null,"JP:Plugins:ExceptionError"+e);
				callbackContext.error("JP:Plugins:ExceptionError "+e.getMessage());
				return false;
			}
	}
}
