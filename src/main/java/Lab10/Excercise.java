/*
* --------------------------File Handling----------------------------------------------------------------------
Exercise 1: Write a Java program that reads a file and displays the file on the screen, with a line number before each line?
* */

package Lab10;


import java.util.*;
        import java.io.*;
class Excercise
{
    public static void main(String args[])throws IOException
    {
        int j=1;
        char ch;
        Scanner scr=new Scanner(System.in);
        System.out.print("\nEnter File name: ");
        String str=scr.next();
        FileInputStream f=new FileInputStream(str);
        System.out.println("\nContents of the file are");
        int n=f.available();
        System.out.print(j+": ");
        for(int i=0;i<n;i++)
        {
            ch=(char)f.read();
            System.out.print(ch);
            if(ch=='\n')
            {
                System.out.print(++j+": ");

            }

        }
    }
}