#include<stdio.h>
void facto();
void main(){
    facto();
}
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