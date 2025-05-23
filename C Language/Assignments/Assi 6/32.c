//prime
#include<stdio.h>
void isPrime(int*);
void main(){
    int n;
    printf("enter the number ");
    scanf("%d",&n);
    isPrime(&n);

}
void isPrime(int* n){
    
    int i=2;
    int flag=0;
    while(i<*n){
        if(*n%i==0){
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