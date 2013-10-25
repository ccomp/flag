import java.awt.*;

public class Stripe2 {
	
	// private Rectangle[] flag = new Rectangle[13];
	private Color color;
	private int x, y;
	private int length = 1000;
	private int height = (int)(length/1.9);
	private double scale;
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
	public void Stripe(Graphics g, Color color, int x, int y, int length, int height, double scale, boolean stripeRed) {
		this.color = color;
		this.x = x;
		this.y = y;
		setLength(length, scale);
		setHeight(height, scale);
		setStripeheight(stripeheight, scale);
		this.scale = scale;
		this.stripeRed = stripeRed;
		// length *=scale;
		// height *= scale;
		// stripeheight *= scale;
	}

	public void draw(Graphics g, Color color, int length, int height, int x, int y) {
		g.fillRect(length, height, x, y);
		g.setColor(color);
	}

	public int length() {
		return length;
	}

	public int height() {
		return height;
	}

	public double stripeheight() {
		return stripeheight;
	}

	public void setLength(int length, double scale) {
		length *= scale;
		this.length = length;
	}

	public void setHeight(int height, double scale) {
		height *= scale;
		this.height = height;
	}

	public void setStripeheight(int stripeheight, double scale) {
		stripeheight *= scale;
		this.stripeheight = stripeheight;
	}

	// getters
	
	// public int stripes() {
	// 	return flag;
	// }

	// setter
	// public void setStripes(int[] flag) {

	// }







}