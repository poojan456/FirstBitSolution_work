// Add the (first and last) digit of a given number?
#include<stdio.h>
int digit(int);
void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    int t=digit(n);
    printf("%d",t);
}
int digit(int n){
    
    int i;
    int sum;
    int r1=n%10;
    while(n>10){
        //int rem=n%10;
        n=n/10;
    }
    sum=r1+n;
    return sum;
    
 
}