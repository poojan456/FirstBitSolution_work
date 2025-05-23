//Write a program to check whether a number is even or odd. 
// with parameter with return type

#include<stdio.h>
int EvenOdd(int);
void main(){
    int a;
    printf("Enter the number");
    scanf("%d",&a);

    int x=EvenOdd(a);
    printf("%d",x);

}
int EvenOdd(int a){
    return a%2==0;

}
    
    
        //printf("its even number");

    
    // else{
    //     printf("its odd number");
    // }
    

