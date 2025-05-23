// vote or not
#include<stdio.h>
void isEligible(int);
void main(){
    int age;
    printf("Ennter the age");
    isEligible(age);

}
void isEligible(int age){
    if(age>=18){
        printf("Eligible");
    }
    else{
        printf("Not ");
    }

}