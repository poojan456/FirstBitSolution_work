//Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>
int main(){
    int a=23;
    int b=78;
    int temp=a;
    a=b;
    b=temp;
    printf("the swaped numbers are %d,%d",a,b);
    return 0;
}