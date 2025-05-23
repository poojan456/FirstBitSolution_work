//Calculate sum of numbers in the given range. 

#include<stdio.h>
void main(){
    int sum=0;
   
    int start;
    int end;
    printf("Enter the start");
    scanf("%d",&start);
    printf("Enter the end");
    scanf("%d",&end);
    for(start=1;start<=end;start++){
        sum=sum+start; 
    }
    printf("the sum of numbers is %d",sum);
}


