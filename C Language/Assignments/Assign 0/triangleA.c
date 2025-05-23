// Write a C program to input the base and height of a triangle and calculate its area. 
#include<stdio.h>
int main(){
    int b,h;
    printf("enter the base ");
    scanf("%d",&b);
    printf("enter the height");
    scanf("%d",&h);
    float area=0.5*b*h;
    printf("the area of triangle is %f", area);
    return 0;
}