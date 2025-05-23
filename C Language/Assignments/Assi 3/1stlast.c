// Add the (first and last) digit of a given number?
//12345
//1+5
#include<stdio.h>
void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    
    int i;
    int sum;
    int r1=n%10;
    while(n>10){
        //int rem=n%10;
        n=n/10;
    }
    sum=r1+n;
    
    printf("the sum of number is %d",sum);
}


