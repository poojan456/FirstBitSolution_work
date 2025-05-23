// using type 2
#include<stdio.h>
int isPerfect();
void main(){
    int x=isPerfect();
    if(x==1){
        printf("perfect number");
    }
    else{
        printf("not perfect");

    }
}
int isPerfect(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int sum=0;
    int i=1;
    while(i<=n/2){
        if(n%i==0){
            sum=sum+i;
            
        }
        i++;
    }
    if(n==sum){
        return 1;
       

    }
    else{
        return 2;
        
    }
}