
package com;
 
import java.util.ArrayList;
import java.util.List;
public class ClassCollection{
	
    public static void main(String []args)
    {
        List<String> fruitlist=new ArrayList<String>();
        fruitlist.add("apple");
        fruitlist.add("Pineapple");
        fruitlist.add("Banana");
       
        for(String fruitloop:fruitlist)
        {
           
            System.out.println("List of Fruuit is "+fruitloop);
        }
    }
}