//range armstrong
#include<stdio.h>
void main(){
    for(int s=1;s<=1000;s++){
        int n=s;
    //algo, code , memory diagram
    // printf("Enter the number");
    // scanf("%d",&n);
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
        int r=temp%10;
        int p=1;
        for(int i=1;i<=count;i++){
            p=p*r;
        }
        sum=sum+p;
        temp=temp/10;
    }
    if(n==sum){
        printf("%d\n",s);
    }
    // else{
    //     printf("not armstrong");
    // }

    }
}