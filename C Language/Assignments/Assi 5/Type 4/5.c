//Write a program to check whether a person is eligible to vote (age ≥ 18).
#include<stdio.h>
int isEligible(int);
void main(){
    int age;
    printf("Enter age");
    scanf("%d",&age);
    int g=isEligible(age);
    if(g==1)
    printf("Eligible to vote");
    else
    printf("Not eligible");
}
int isEligible(int A){
    if(A>=18){
        return 1;
    }
    else{
        return 0;
    }

}