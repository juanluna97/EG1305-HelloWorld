public class Fan {
	boolean fanStatus = false;
	int fanSpeed;
	String color = "blue";
	double radius = 5;

	   public Fan() {
	   }
	   public Fan(int speed, boolean fanStatus, double radius, String color) {
	       this.fanStatus = fanStatus;
	       this.fanSpeed = fanSpeed;
	       this.color = color;
	       this.radius = radius;
	   }
	public String toString() {
		return color + " " + fanStatus + " " + fanSpeed + " " + radius;
}
}
