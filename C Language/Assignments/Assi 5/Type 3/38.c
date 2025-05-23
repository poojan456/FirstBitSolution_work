//. Add the (first and last) digit of a given number?
#include<stdio.h>
void FL(int);
void main(){
    int n;
    printf("Enter the number:");
    scanf("%d",&n);
    FL(n);
}
void FL(int n){
    
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