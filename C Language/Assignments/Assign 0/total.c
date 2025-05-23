// Write a C program to input marks of five subjects, find the total marks, and calculate 
//the percentage. 
#include<stdio.h>
void main(){
    int a1,a2,a3,a4,a5;
    printf("five marks of subject are :");
    scanf("%d %d %d %d %d",&a1,&a2,&a3,&a4,&a5);
    int total=a1+a2+a3+a4+a5;

    printf("the total marks of student is %d\n",total);
    float perc=(total/5.0);
    printf("the percetage of marks is %f",perc);

}