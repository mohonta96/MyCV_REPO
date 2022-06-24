#include<iostream>
//#include<bits/stdc++.h>
#define size 5
using namespace std;

int top = -1, ele;
int stack[size];

int isFull(){
    if(top == size-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isEmpty(){
    if(top==-1){
        return 1;
    }
    else{
        return 0;
    }
}

void push(int element){
    if(isFull()){
        cout<<"the stack is full sorry!"<<endl;
    }
    else{
        top++;
        stack[top] = element;
        cout<<"one element is pushed succefully"<<endl;;
    }
}

int pop(){
    int element;
    if(isEmpty()){
        cout<<"the stack is empty, Sorry!"<<endl;
    }
    else{
        return stack[top--];
        cout<<"one Elemtn poped succesfully"<<endl;
    }
}

int select(){
    if(isEmpty()){
        return 0;
    }
    else{
        return top;
    }
}

void traverse(){
    int i;
    if(isEmpty()){
        cout<<"the stack is Empty"<<endl;
    }
    else{
        for(i=0; i<=top; i++){
            cout<<stack[i]<<endl;
        }
    }
}

int main(){
    int t, temp;
    t = 1;
    while (t--){
        int test;
        cout<<"-----choice is your------"<<endl;
        cout<<"Enter 1 for: push; 2 for: pop; 3 for: traverse; 4 for: select? "<<endl;
        cin>>test;
        switch(test){
            case 1:
                cout<<"Enter element for push data: "<<endl;
                cin>> ele;
                push(ele);
                break;
            case 2:
                ele = pop();
                if(ele == 0){
                    cout<<"Stack is underflow!"<<endl;
                }
                else{
                    cout<<"The deleted item is: "<<ele<<endl;
                }
                break;
            case 3:
                traverse();
                break;
            case 4:
                select();
                break;
            default:
                cout<<"invlid Entery";
                break;
        }
        cout<<"are you want to close the programe??"<<endl;
        cout<<"Enter 1 to run agin and 0 to terminate: ";
        cin>>temp;
        t = temp;
    }
    
}