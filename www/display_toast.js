var display_toast = {
    show_toast: function(successCallback, errorCallback, message) {
		cordova.exec( successCallback,
		            errorCallback,
					"Display_Toast",
					"Toast_method_called",
					message
					);
    }
}

module.exports = display_toast;

