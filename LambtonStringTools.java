package c0743970_midterm_madf3463;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 743970
 */
public class LambtonStringTools
{
 

     public void reverse(String s)
     {
          String  str = s;
          String reversed = " ";
           for(int i = s.length()-1; i>=0; i--)
           {
            reversed = reversed + s.charAt(i);
           }
            System.out.println("Original String = " +s);
            System.out.println("Reversed string = " + reversed);
     }
     
     public void replaceSubString(String s1, String s2, String s3)
     {
       String firststr = s1.toLowerCase();
       String secondstr = s2.toLowerCase();
       String thirdstr = s3.toLowerCase();
 int length = firststr.length();
 
for (int i = 0; i <length; i++)
{
        for (int j =0; j < length; j++)
        {
                //if (secondstr[i] == thirdstr[j])
                {                    
                  // replace()
 
                }
        }
 
}
       
       
    }
     
     public void mostFrequent(String s)
     {
         char frequentchar = ' ';
    int maximum = 0;
 
    int[] charcnt = new int[Character.MAX_VALUE + 1];
    for (int i = s.length() - 1; i >= 0; i--) {
        char ch = s.charAt(i);
        
        if (++charcnt[ch] >= maximum) {
            maximum = charcnt[ch];
            frequentchar = ch;
        }
        
    }   
        System.out.println("");
        System.out.println(" String = " +s);
        System.out.println("chracter that occurs most frequently : " +frequentchar);
     }

     public void binaryToDecimal(String s) 
     {
     
     }
     
     public void initials(String s)
     {
       
        char c;
        int l;
        System.out.print(" ");
        System.out.print("String is " +s);
        s=" "+s; 
        l=s.length();
        System.out.print("/n initals = ");
        for(int i=0;i<l;i++)
        {
           c=s.charAt(i);
           if(c==' ') 
               
            System.out.print(s.charAt(i+1)+".");
          }
     }
}
     


