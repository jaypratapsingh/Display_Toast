*************Cordova : Display Toast*****************

By using this plugin you can show toast


Install this plugin using:

cordova plugin add com.jp.plugin.display_toast



Remove Plugins :

cordova plugin remove com.jp.plugin.display_toast



Put the below code in your javascript code to show_toast: 

display_toast.show_toast(
	function(success)
	{
            console.log(success);
        }, 
	function(error)
	{
            console.log(error);
        },
	message
    );


GitHub URL:   https://github.com/jaypratapsingh/Display_Toast

npm url :     https://www.npmjs.com/package/com.jp.plugin.display_toast