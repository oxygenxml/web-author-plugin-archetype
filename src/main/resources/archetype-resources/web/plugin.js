(function () {
	
  goog.events.listen(workspace, sync.api.Workspace.EventType.BEFORE_EDITOR_LOADED, function(e) {
    console.log('Plugin loaded successfully');
  });
  
})();
