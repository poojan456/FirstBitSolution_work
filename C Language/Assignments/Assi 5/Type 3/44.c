//
#include<stdio.h>
void isStrong(int);
void main(){
    int num;
    isStrong(num);

}
void isStrong(int num){
      for(int t=1;t<=50;t++){
        int num = t;
    // printf("Enter number");
    // scanf("%d",&n);
    int sum=0;
  
    int rem;
    while(num>0){
        rem=num%10;
        int fact=1;
        for(int i=1;i<=rem;i++){
         
            fact=fact*i;    
        }
        sum=sum+fact;
        num=num/10;
    }
    if(sum==t){
        printf("%d\n",t);
    }
    }

}