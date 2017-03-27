	public class Coin
	{
	   int Heads = 0;
	   int Tails = 1;

	   private int face;
	   
	   public Coin ()
	   {
		   flip();
	   }

	   public void flip ()
	   {
	      face = (int) (Math.random() * 2);
	   }

	   public boolean isHeads ()
	   {
	      return (face == Heads);
	   }

	 
	   public String toString()
	   {
	      String faceName;

	      if (face == Heads)
	         faceName = "Heads";
	      else
	         faceName = "Tails";

	      return faceName;
	   }
	}
