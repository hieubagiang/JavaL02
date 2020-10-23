/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.Bai2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author PhamDoanHieu
 */
public class Stack {
   
    
   private LinkedList<Integer> stackArray;
   private int top;

    public Stack() {
        top=-1;
        stackArray = new LinkedList<>();
    }
   
   public void push(int data)
   {
       top++;
       stackArray.addLast(data);
   }
   public int pop()
   {
       if(!isEmpty())
       {
           
           return            stackArray.get(top--);
           

       }
       return -1;
   }

    private boolean isEmpty() {
        return top==-1;
    }
   
    public int numOfElement()
    {
        return stackArray.size();
    }
    public int search(int key)
    {
        int tmp = numOfElement()-1;
        while(!isEmpty())
        {
            
            if(stackArray.get(tmp) == key)
            {
                return tmp;
            }
            tmp--;
        }
        return -1;
    }
    public void display()
    {
        for(int i=numOfElement()-1; i>=0;i--)
        {
            System.out.println(stackArray.get(i));
        }
    }
}
