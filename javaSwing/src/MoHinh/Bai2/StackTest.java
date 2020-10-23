/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.Bai2;

/**
 *
 * @author PhamDoanHieu
 */
public class StackTest {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Stack hiện tại: ");
        myStack.display();
        System.out.println("\nSố phần tử: " + myStack.numOfElement());
        
        System.out.println("Tìm kiếm: ");
        System.out.println(myStack.search(3));

        System.out.println("Pop: ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " ");
        System.out.print(myStack.pop() + " "); // rỗng return -1
        System.out.print(myStack.pop() + " "); // rỗng return -1
        
        
    }
}
