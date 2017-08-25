(function () {
	dorado.widget.imageViewer = $extend(dorado.widget.Control, {
		    $className : "dorado.widget.imageViewer",
		    ATTRIBUTES : {
		    	  button: {defaultValue : true},
		    	  navbar: {defaultValue:false},
		    	  title: {defaultValue:true},
		    	  toolbar: {defaultValue:true},
		    	  tooltip: {defaultValue:true},
		    	  movable: {defaultValue:true},
		    	  zoomable: {defaultValue:true},
		    	  rotatable: {defaultValue:true},
		    	  scalable: {defaultValue:true},
		    	  transition: {defaultValue:true},
		    	  fullscreen: {defaultValue:true},
		    	  keyboard: {defaultValue:true},
		    	  inline:{defaultValue: false},
		    	  url : {defaultValue: "src"},
		    	  imageList : {
		    		  setter : function(value, attr){
		    			  this._imageList = value;
	  				}
		    	  }
		    },
		    EVENTS: {
		      build: function (e) {
	          },
	          built: function (e) {
	          },
	          show: function (e) {
	          },
	          shown: function (e) {
	          },
	          hide: function (e) {
	          },
	          hidden: function (e) {
	          },
	          view: function (e) {
	          },
	          viewed: function (e) {
	          },
	          
		    },
		    execute : function(){
		    	var options = {
		    		  button		: 	this._button,
			    	  navbar		: 	this._navbar,
			    	  title			: 	this._title,
			    	  toolbar		: 	this._toolbar,
			    	  tooltip		: 	this._tooltip,
			    	  movable		: 	this._movable,
			    	  zoomable		: 	this._zoomable,
			    	  rotatable		: 	this._rotatable,
			    	  scalable		: 	this._scalable,
			    	  transition	: 	this._transition,
			    	  fullscreen	: 	this._fullscreen,
			    	  keyboard		: 	this._keyboard,
			    	  inline		: 	this._inline,
			    	  url 			: 	this._url,	
		    	}
		    	$("body").viewer(options);
		    }
	});
})();