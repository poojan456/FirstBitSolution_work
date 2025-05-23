//using type2
#include<stdio.h>
int isStrong();
void main(){
    int l=isStrong();
    if(l==1){
        printf("strong");
    }
    else{
        printf("not strong");
    }
}
int isStrong(){
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
        return 1;
    }
    else{
        return 0;
    }

}