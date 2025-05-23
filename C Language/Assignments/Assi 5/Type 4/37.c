//strong or not
#include<stdio.h>
int isStrong(int);
void main(){
    int n;
    scanf("%d",&n);
    int b=isStrong(n);
    if(b==1)
     printf("strong number\n");
    else
    printf("not strong number\n");
    

}
int isStrong(int n){
    int sum=0;
   
    int temp=n;
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
        return 1;
       
    }
    else{
        return 0;
    }

}
