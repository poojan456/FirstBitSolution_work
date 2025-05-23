
//using type 2
#include<stdio.h>
int isArm();
void main(){
   
    int res=isArm();
    
   
    
}
int isArm(){
    int n;
    //algo, code , memory diagram
   
    printf("Enter the number");
    scanf("%d",&n);
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
    if(sum==n){
        printf("Armstrong");
    }
    else{
        printf("not armstrong");
    }

    return sum;

    

}