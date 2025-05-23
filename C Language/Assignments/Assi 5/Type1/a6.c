
// vote using fun
#include<stdio.h>
void vote();
 void main(){
    vote();

 }
 void vote(){
    int age;
    printf("enter your age");
    scanf("%d",&age);
    if(age>=18){
        printf("You can vote");
    }
    else{
        printf("u cannot vote");
    }
 }