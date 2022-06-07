import java.util.ArrayList;

public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * @return boolean array of used elements for calculation
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param boolean winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return ArrayList of Integers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return the value of sum
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return successfully found flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
