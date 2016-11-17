/**
 * 
 */
package javap02;

import java.util.Scanner;

/**
 * @author old_lenovo
 *
 */
public class MainEntryClass {
	private int s;
	private static int DEFAULT_S;
	
	public int multiplier(int _v)
	{
		_v = addme(_v);
		return 2* _v;
	}
	public int addme(int _add)
	{
		return 100 + _add;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD");
		Scanner Scanner = new Scanner(System.in);
		
		int myX = MainEntryClass.DEFAULT_S;
		MainEntryClass mec = new MainEntryClass();
		mec.s = 101;
		System.out.println("mec.s is" + mec.s);
		
		System.out.println("exiting the program");
		mec.s = 202;
		System.out.println("mec.s is " + mec.s);
		
		int retVAL = mec.multiplier(300);
		System.out.println(retVAL);

	}

}
