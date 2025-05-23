//Check number is armstrong or not? 
#include<stdio.h>
int isArm(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);


    int x=isArm(n);
    if(x==1)
    printf("Armstrong number");
    else
    printf("Not armstrong number");

}
int isArm(int n){
    
    int temp=n;

    int count=0;
    while(temp>0){
        temp=temp/10;
        count++;
       // sum=sum+n*count;
       // n=n/10;
    }
    temp=n;
    int sum=0;

    while(temp>0){
        int rem=temp%10;
        int p=1;
        for(int i=1;i<=count;i++){
            p=p*rem;
        }
         sum=sum+p;
        temp=temp/10;
    }
    if(n==sum)
        return 1;
    else
    return 0;

    

}