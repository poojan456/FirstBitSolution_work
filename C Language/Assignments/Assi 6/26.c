//divisible 
#include<stdio.h>
void isDivisible(int*);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    isDivisible(&n);

}
void isDivisible(int* n){
    
    if(*n%3==0 && *n%5==0){
        printf("Divisible by both");
    }
    else if(*n%3==0){
        printf("divisible by 3 but not 5");

    }
    else if(*n%5==0){
        printf("divisible by 5 but not 3");
    }
    else{
        printf("divisible by none");
    }

}