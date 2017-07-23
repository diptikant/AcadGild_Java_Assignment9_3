package Java_Assignment93;
/*
 * This class will help on Collection Framework and Comparator Interface.
 */

import java.util.*;  
public class Java_Assignment9_3 
{

	
	public static void main(String[] args) 
	{
		HDTV tv1 = new HDTV(55, "Samsung"); //First HDTV instance
		HDTV tv2 = new HDTV(60, "Sony"); //Second HDTV instance
		HDTV tv3 = new HDTV(42, "Panasonic"); //Third HDTV instance
 
		ArrayList<HDTV> al = new ArrayList<HDTV>(); //ArrayList declaration
		al.add(tv1); //Adding tv1 instance of hdtv to ArrayList
		al.add(tv2); //Adding tv2 instance of hdtv to ArrayList
		al.add(tv3); //Adding tv3 instance of hdtv to ArrayList
 
		//Sorting the arraylist in size
		Collections.sort(al, new SizeComparator());
		for (HDTV a : al) //To display the brand in sorted order of size
		{
			//printing the brand and size of the HDTV
			System.out.println("Brand: "+a.getBrand()+"\tSize: "+a.getSize());
		}

	}

}

class HDTV //HDTV class
{
	private int size;
	private String brand;
 
	public HDTV(int size, String brand) //Constructor
	{
		this.size = size;
		this.brand = brand;
	}
 
	public int getSize() 
	{
		return size;
	}
 
	public void setSize(int size) 
	{
		this.size = size;
	}
 
	public String getBrand() 
	{
		return brand;
	}
 
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
}
 //SizeComparator class inheriting from comarator interface
class SizeComparator implements Comparator<HDTV> 
{
	@Override
	public int compare(HDTV tv1, HDTV tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();
 
		if (tv1Size > tv2Size) 
		{
			return 1;
		} else if (tv1Size < tv2Size) 
		{
			return -1;
		} else 
		{
			return 0;
		}
	}
}
