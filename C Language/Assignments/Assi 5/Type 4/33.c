//Check number is prime or not. 
#include<stdio.h>
int isPrime(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int check=isPrime(n);
    if(check==1)
    printf("Prime number");
    else
    printf("Not prime number");

}
int isPrime(int n){
    int flag=0;
    int i=2;
    while(i<n){
        if(n%i==0){
            flag=1;
            break;
        }
        i++;
    }
    if(flag==0){
        return 1;
    }
    else {
        return 0;
    }


}