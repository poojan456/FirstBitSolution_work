
//Find factorial of number.
#include<stdio.h>
void Factorial(int);
void main(){
    int n;
    
    printf("The the number");
    scanf("%d",&n); 
    Factorial(n);

}
void Factorial(int n){
    int fact=1;
          
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    printf("the factorial of number is %d",fact);

}