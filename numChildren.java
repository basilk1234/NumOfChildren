/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
        int numChildren = 5;
        System.out.println("Enter the ages of the " + numChildren + " children (each within 0 - 10 years old): ");
        
        int[] childrenAges = new int[numChildren];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < childrenAges.length; i++)
        {
            int childAge = myScanner.nextInt();
            
            if (childAge < 0)
            {
                childAge = 0;
            }
            else if (childAge > 10)
            {
                childAge = 10;
            }
            
            childrenAges[i] = childAge;
        }
        
        /*   
        System.out.println("Output test:");
        for (int i = 0; i < childrenAges.length; i++)
        {
            System.out.println(childrenAges[i]);
        }
        */
        
        int[] childrenAgeGroups = new int[11];
        for (int i = 0; i < childrenAgeGroups.length; i++) // We're going through each child age group.
        {
            for (int j = 0; j < childrenAges.length; j++) // For each child age group, we search all the entered values of children ages.
            {
                // Increment the number of children in the age group i if we have an entered age that belongs in that group.
                // EX: if we are looking for 0-year-old.
                if (childrenAges[j] == i)
                {
                    childrenAgeGroups[i]++;
                }
            }
        }
        
        for (int i = 0; i < childrenAgeGroups.length; i++)
        {
            System.out.println(childrenAgeGroups[i] + " children are " + i + " years old.");
        }
	}
}

// Testing it out:
/*
Enter the ages of the 5 children (each within 0 - 10 years old): 
0 0 1 5 5
2 children are 0 years old.
1 children are 1 years old.
0 children are 2 years old.
0 children are 3 years old.
0 children are 4 years old.
2 children are 5 years old.
0 children are 6 years old.
0 children are 7 years old.
0 children are 8 years old.
0 children are 9 years old.
0 children are 10 years old.
*/
