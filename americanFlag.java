import java.awt.*;

public class americanFlag {
	
	private Color color;
	private int x, y;
	private int length = 1000;
	private int height = (int)(length/1.9);
	private boolean stripeRed;
	private int stripeheight = (int)(height/13);



	// private Rectangle union;
	// private static int broteger = 0;
	// private static int width = 1000;
	// private static int height = (int)(width/1.9);


	// public static void main(String[] args, Graphics g) {
	// 	int t1ngleCount = 0;
	// 	double stripeheight = height/13;
	// 	for (int i = 0; i<14; i++) {
	// 		if (t1ngleCount <= 6) {
	// 			stripeheight = 0;
	// 			if (t1ngleCount = 0) {
	// 				drawRedt1ngle(g, broteger, 0);
	// 			}
	// 			drawRedt1ngle(g, broteger, stripeheight);
	// 			t1ngleCount++;
	// 			drawWhit1ngle(g, broteger, stripeheight + (height/13));
	// 			stripeheight+=(height/13);
	// 			t1ngleCount++;
	// 			// 
	// 		} else if (t1ngleCount > 6 && t1ngleCount < 13) {
	// 			=stripeheight*6;
	// 			drawRedt2ngle(g, 25, broteger+42);
	// 			t1ngleCount++;
	// 			drawWhit2ngle(g, 25, broteger+49);
	// 			broteger+=14;
	// 		}

	// 	}
	// }

	public void AmericanFlag(Graphics g) {
		int quasiHeight = 0;
		for (int i = 0; i<14; i++) {
			Stripe2 red = new Stripe2(g, Color.RED, 0, quasiHeight, length, stripeheight, 1.0, true);
			Stripe2 white = new Stripe2(g, Color.WHITE, 0, stripeheight, length, stripeheight, 1.0, true);
			quasiHeight=stripeheight;
			stripeheight+=stripeheight;
		}
	}

	public static void drawRedt1ngle(Graphics g, int x, int y) {
		g.setColor(Color.RED);
		g.fillRect(7, 50, x, y);
	}

	public static void drawWhit1ngle(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.fillRect(7, 50, x, y);
	}

	public static void drawRedt2ngle(Graphics g, int x, int y) {
		g.setColor(Color.RED);
		g.fillRect(7, 25, x, y);
	}

	public static void drawWhit2ngle(Graphics g, int x, int y) {
		g.setColor(Color.WHITE);
		g.fillRect(7, 25, x, y);
	}

	public static void randomBrotangle(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(22, 25, 0, 28);
	}

}