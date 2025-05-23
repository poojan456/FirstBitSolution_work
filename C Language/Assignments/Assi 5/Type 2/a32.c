//using type2
#include<stdio.h>
int isPrime();
void main(){
    int x=isPrime();
    if(x==0){
        printf("its prime");
            
        
    }
    else{
        printf("not prime number");
    }



}
int isPrime(){
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
    return flag;
    

}
