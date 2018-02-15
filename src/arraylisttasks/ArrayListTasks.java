/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttasks;

import java.util.ArrayList;

/**
 *
 * @author CPP_Curriculum
 */
public class ArrayListTasks {
    //adding ArrayLists to the class
    public static ArrayList shoppingList = new ArrayList();
    public static ArrayList mixedArrayList = new ArrayList();
    
    public static void main(String[] args) {
        //TASK 1: adding shopping list items
        shoppingList.add("juice");
        shoppingList.add("bread");
        shoppingList.add("butter");
        shoppingList.add("cheese");
        
        //TASK 1: printing shopping list items out
        printShoppingList(shoppingList);
        
        //TASK 1: adding quiche items to the shopping list
        shoppingList.add("eggs");
        shoppingList.add("vegetables");
        shoppingList.add("chicken");
        shoppingList.add("milk");
        shoppingList.add("pastry");
        
        //TASK 1: printing out updated shopping list
        printShoppingList(shoppingList);
        
        //TASK 1: removing unneccessary items from the list
        shoppingList.remove("bread");
        shoppingList.remove("butter");
        shoppingList.remove("cheese");
        
        //TASK 1: printing out updated shopping list
        printShoppingList(shoppingList);
        
        
        //TASK 2: Adding elements to the mixedArrayList
        mixedArrayList.add(1);
        mixedArrayList.add("John Smith");
        mixedArrayList.add(70.2);
        
        //TASK 2: Creating new Person object
        Person person1 = new Person(Integer.valueOf(mixedArrayList.get(0).toString()), 
        mixedArrayList.get(1).toString(), Float.valueOf(mixedArrayList.get(2).toString()));

        //TASK 2: printing our person1's information
        System.out.println(person1);
    }
    
    //TASK 1: prints out shopping list in a user-friendly manner
    private static void printShoppingList(ArrayList list){
        System.out.println("Shopping List:");
        for (Object s: list){
            System.out.println(s);
        }
        System.out.println("");
    }    
}
