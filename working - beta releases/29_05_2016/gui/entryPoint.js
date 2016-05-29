IDE_Morph.prototype.openIn = function (world) {
	var hash,
		usr,
		myself = this,
		urlLanguage = null;
	this.buildPanes();
	world.add(this);
	world.userMenu = this.userMenu;
	this.reactToWorldResize(world.bounds);
	this.rawOpenProjectString(this.snapproject);
	this.toggleAppMode(true);
	var handle = setInterval(
		function () {
			var allSpritesDone = true;
			myself.stage.children.forEach(
				function (child) {
					var allCostumesLoaded = true;
					if (child.costumes) {
						child.costumes.contents.forEach(
							function (costume) {
								if (typeof costume.loaded === "function") allCostumesLoaded = false;
							}
						);
					}
					if (!allCostumesLoaded || (child.costumes && child.costumes.length > 0 && !child.costume)) {
						allSpritesDone = false;
					}
				}
			);
			if (allSpritesDone) {
				clearInterval(handle);
				myself.runScripts();
			}
		},
		100
	);
};