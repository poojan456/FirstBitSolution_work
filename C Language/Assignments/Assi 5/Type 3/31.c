
//type3
// Calculate sum of numbers in the given range.
 #include<stdio.h>
 void sum(int, int);
 void main(){
    int start;
    int end;
    printf("Enter the start");
    scanf("%d",&start);
    printf("Enter the end");
    scanf("%d",&end);
    sum(start,end);

 }
 void sum(int start, int end){
    int sum=0;
   
    
    for(start=1;start<=end;start++){
        sum=sum+start; 
    }
    printf("the sum of numbers is %d",sum);

 }