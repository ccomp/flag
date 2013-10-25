import java.awt.*;


public class Executor {
	
	private static int broteger = 0;
	private static int width = 1000;
	private static int height = (int) (width/1.9);

	public static void main(String[] args, Graphics g) {
		int t1ngleCount = 0;
		double stripeheight = height/13;
		for (int i = 0; i<14; i++) {
			if (t1ngleCount <= 6) {
				stripeheight = 0;
				if (t1ngleCount == 0) {
					drawRedt1ngle(g, broteger, 0);
				}
				drawRedt1ngle(g, broteger, stripeheight);
				t1ngleCount++;
				drawWhit1ngle(g, broteger, stripeheight + (height/13));
				stripeheight+=(height/13);
				t1ngleCount++;
				// 
			} else if (t1ngleCount > 6 && t1ngleCount < 13) {
				stripeheight=stripeheight*6;
				drawRedt2ngle(g, 25, broteger+42);
				t1ngleCount++;
				drawWhit2ngle(g, 25, broteger+49);
				broteger+=14;
			}
	
		}	
	}

}