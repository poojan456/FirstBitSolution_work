//Find factorial of number. 
#include<stdio.h>
void main(){
    int n;
    int fact=1;
    printf("The the number");
    scanf("%d",&n);       
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    printf("the factorial of number is %d",fact);
}

