//using type 2

#include<stdio.h>
int sum();
void main(){
    int x=sum();
    printf("the sum of numbers is %d",x);


}
int sum(){
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
    return sum;
    

}
