import java.util.*;

import javax.lang.model.element.Element;
public class Stack{
    static int stack_arr[], top = -1, size, item;
    static Scanner s = new Scanner(System.in);

    static{
        Stack.create();
    }

    public static void main(String[] args) {
        boolean t=true, temp;
        int choiche;

        while(t){
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. traverse");
            System.out.println("4. pick");
            //System.out.println("5. exit");
            System.out.println("Enter your choiche: ");
            choiche = Stack.s.nextInt();

            switch(choiche){
                case 1:
                    System.out.println("Enter element for push: ");
                    item = Stack.s.nextInt();
                    Stack.push(item);
                break;

                case 2:
                    item = pop();
                    if(item == 0){
                        System.out.println("the Stack is underfllow ");
                    }
                    else{
                        System.out.println("poped succefull "+item);
                    }
                break;

                case 3:
                traverse();
                break;
                case 4:
                    item = pick();
                    if(item == 0){
                        System.out.println("The stack is underflow");
                    }
                    else{
                        System.out.println("peek is :"+item);
                    }

                break;
                case 5:
                System.exit(1);
                default:
                System.out.println("invalid key pressed! sorry");
                break;
            }
            
            System.out.print("1. for run agin & 0 for quit: ");
            choiche = Stack.s.nextInt();

            switch(choiche){
                case 1:
                    temp = true;
                    t = temp;
                    break;
                case 0:
                    temp = false;
                    t = temp;
                    break;
                default:
                    System.out.println("invalid Enter !\b");
                    break;
            }
        }
    }
    static void create(){
        System.out.print("Enter size of Stack: ");
        size = Stack.s.nextInt();
        Stack.stack_arr = new int[size];
        System.out.println("The stack is create succesfully : "+size);
    }

    static void push(int item){
        if(Stack.isFull()){
            System.out.println("The stack is full");
        }
        else{
            Stack.stack_arr[++top] = Stack.item;
        }
    }

    static boolean isFull(){
        if(top == size-1){
            return true;
        }
        else{
            return false;
        }
    }

    static int pop(){
        if(Stack.isEmpty()){
            return 0;
        }
        else{
            return stack_arr[top--];
        }
    }

    static boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    static void traverse(){
        if(Stack.isEmpty()){
            System.out.println("the sack is empty");
        }
        else{

            System.out.println("...start traversing data from stack.....");
            for(int i = top; i>=0; i--){
                System.out.println("stack data: " +stack_arr[i]);
            }
        }
    }

    static int pick(){
        if(Stack.isEmpty()){
            return 0;
        }
        else{
            return stack_arr[top];
        }
    }
}