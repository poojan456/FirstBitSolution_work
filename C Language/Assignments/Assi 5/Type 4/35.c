//perfect
#include<stdio.h>
int isPerfect(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int d=isPerfect(n);
    if(d==1)
    printf("Perfect number");
    else
    printf("not perfect number");
   
}
int isPerfect(int n){
     
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
        return 0;
       
    }

}


