//Accept a number and check if it is divisible by 3, 5, or both. 
#include<stdio.h>
int isDivisible(int);
void main(){
    int n;
    printf("Enter any number");
    scanf("%d",&n);
    int p=isDivisible(n);
    if(p==35){
        printf("divisible by 3 and 5");
    }
    else if(p==5){
        printf("divisible by 5");
    }
    else if(p==3){
        printf("divisible by 3");
    }
    else{
        printf(" ");
    }
}
int isDivisible(int n){
    if(n%3==0 && n%5==0){
        return 35;
        
    }
    else if(n%5==0){
        return 5;
    }
    else if(n%3==0){
        return  3;
    }
    else {
        return 0;
    }
}