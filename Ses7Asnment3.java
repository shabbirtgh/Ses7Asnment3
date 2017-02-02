package myPack;

import java.util.Scanner;

public class Ses7Asnment3 {

	public static void main(String[] args)
	{
		Substring2 ss = new Substring2();
		
		boolean b = ss.SubStringFinder();
		System.out.println("Entered substring is present in string ? "+b);

	}

}

class Substring2
{
	public boolean SubStringFinder()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string value : ");
	String s1 = sc.nextLine();
	
	System.out.println("Enter a substring value to be searched from previous string : ");
	String s2 = sc.nextLine();	
	
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	
	
	for (int i = 0; i < c1.length - c2.length+1; i++) 
	{
        for (int j = 0; j < c2.length; j++) 
        {
            if (c1[i + j] == c2[j]) 
            {
                if (j == c2.length - 1) 
                {
                    return true;
                }
            } 
            else 
            {
                break;
            }
        }
    }
    return false;
	
	}
}