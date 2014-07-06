package playn_wrap_demo.core;

import playn.core.Game;
import playn.core.Image;
import playn.core.ImageLayer;
import pythagoras.f.Dimension;
import tripleplay.ui.Label;
import tripleplay.ui.Style;
import tripleplay.util.Logger;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

public class Main extends Game.Default {
	private static Logger log = new Logger("playn_wrap_demo");

	public Main() {
		super(33); // call update every 33ms (30 times per second)
	}

	@Override
	public void init() {
		// create and add background image layer
		Image bgImage = assets().getImage("images/bg.png");
		ImageLayer bgLayer = graphics().createImageLayer(bgImage);
		graphics().rootLayer().add(bgLayer);

		PimpedLabel label = new PimpedLabel("i i i i i i i i i i i i i i i i i i i i i i i");
		label.setStyles(Style.TEXT_WRAP.on);
		label.computeSize(60f, 100f);
		label.computeSize(59f, 100f);
		System.exit(0);
	}

	@Override
	public void update(int delta) {
	}

	@Override
	public void paint(float alpha) {
		// the background automatically paints itself, so no need to do anything here!
	}

	public static class PimpedLabel extends Label {
		public PimpedLabel(String text) {
			super(text);
		}

		@Override
		public Dimension computeSize(float hintX, float hintY) {
			Dimension result = super.computeSize(hintX, hintY);
			log.info("computeSize", "hintX", hintX, "hintY", hintY, "result", result);
			return result;
		}
	}
}
