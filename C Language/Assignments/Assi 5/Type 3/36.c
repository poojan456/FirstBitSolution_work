
// Check number is strong or not.
#include<stdio.h>
void isStrong(int);
void main(){
    int n;
    
    printf("Enter number");
    scanf("%d",&n);
    isStrong(n);
}
void isStrong(int n){
    int temp;
    
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