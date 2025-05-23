#include<stdio.h>
void divisible();
void main(){
    divisible();
}
void divisible(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    if(n%3==0 && n%5==0){
        printf("Divisible by both");
    }
    else if(n%3==0){
        printf("divisible by 3 but not 5");

    }
    else if(n%5==0){
        printf("divisible by 5 but not 3");
    }
    else{
        printf("divisible by none");
    }
}