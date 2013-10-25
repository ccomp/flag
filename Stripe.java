import java.awt.*;

public class Stripe {
	
	// private Rectangle[] flag = new Rectangle[13];
	private Color color;
	private int x, y;
	private int length = 1000;
	private int height = (int)(length/1.9);
	private boolean stripeRed;
	private double stripeheight = (int)(height/13);
	


	// constructor
	// public AmericanFlag(int x, int y, int length, int height, double scale) {
	// 	this.length = length;
	// 	this.height = height;
	// 	this.scale = scale;
	// 	setStripes(stripes);
	// }

	// behaviour
	public Stripe(Graphics g, Color color, int x, int y, int length, int height, double scale, boolean stripeRed) {
		length *=scale;
		height *= scale;
		stripeheight *= scale;
		g.fillRect(length, height, x, y);
		g.setColor(color);
	}

	public void spare(Graphics g) {
		this.length = length;
	}

	// getters
	
	// public int stripes() {
	// 	return flag;
	// }

	// setter
	// public void setStripes(int[] flag) {

	// }







}