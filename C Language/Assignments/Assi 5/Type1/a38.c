#include<stdio.h>
void strong();
void main(){
    strong();
}
void strong(){
    int n;
    int temp;
    printf("Enter number");
    scanf("%d",&n);
    int sum=0;
    temp=n;
    int rem;
    while(n>0){
        rem=n%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
         
            fact=fact*i;    
        }
        sum=sum+fact;
        n=n/10;
    }
    if(sum==temp){
        printf("strong number\n");
    }
    else{
        printf("not strong number\n");
    }
}