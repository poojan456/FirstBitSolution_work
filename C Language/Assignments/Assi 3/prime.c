// Check number is prime or not. 
#include<stdio.h>
void main(){
    int n;
    printf("enter the number ");
    scanf("%d",&n);
    int i=2;
    int flag=0;
    while(i<n){
        if(n%i==0){
            flag=1;
            break;
        }
        i++;
        
    }
    if(flag==0){
        printf("its prime");
            
        
    }
    else{
        printf("not prime number");
    }

}


