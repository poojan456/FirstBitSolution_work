//5. Write a C program to input five numbers and find their average. 
#include<stdio.h>
void main(){
    int a,b,c,d,e;
    float avg;
  
    printf("enter 5 number");
    scanf("%d",&a,&b,&c,&d,&e);

     avg=(a+b+c+d+e)/5;
    printf("the average of 5 number is %f",avg);
}