#include<stdio.h>
void arm();
void main(){
    arm();

}
void arm(){
    int n;
    //algo, code , memory diagram
    int temp=n;
    printf("Enter the number");
    scanf("%d",&n);
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
        int r=temp%10;
        int p=1;
        for(int i=1;i<=count;i++){
            p=p*r;
        }
        sum=sum+p;
        temp=temp/10;
    }
    if(n==sum){
        printf("Armstrong");
    }
    else{
        printf("not armstrong");
    }

}