package com.example.laptop.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner; //This is needed for the user I/O
import java.util.ArrayList; //This is needed to for the ArrayList
import java.util.Iterator; //This is for use of the iterator
import java.util.Random; //This is needed to use the random number generator

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args)
    {
        int n;                                             //This initializes the n variable for the size of the array
        ArrayList<String> al = new ArrayList<String>();         //This initializes the ArrayList
        Scanner ac = new Scanner(System.in);               //This initializes the scanner for user input output
        System.out.print("Enter number of elements: ");    //This prompts the user to input an int for how much items are in the ArrayList
        n = ac.nextInt();                                  //This takes the input for maximums size of the ArrayList
        System.out.print("You entered n = " + n);          //This shows the amount this is mostly for debugging
        System.out.print("\n");                            //This prints a blank line
        for(int x = 1; x <= n; x++)                        //This starts the for loop that asks the user to input their elements
        {
            System.out.println("Enter next element: ");
            al.add(ac.next());
        }
        Iterator itr=al.iterator();                         //This initializes the iterator for the ArrayList
        for (int i = 0; i < n; i++)                         //This starts the for loop to output the items in the ArrayList
        {
            System.out.print(itr.next() + " ");
        }
        System.out.print("\n");                                //This prints a blank line
        System.out.println(al.get(randomItem(al.size())));      //This will output the random number that is chosen by the randomItem
    }

    public static int randomItem(int size)
    {
        Random rand;
        rand = new Random();
        Integer randomInt = rand.nextInt(size);                 //This will get the index item from the ArrayList
        return randomInt;                                       //This will return the item and allow the output from the ArrayList
    }

}
