// Passing array to function 
// 1. 
// Do all the questions of ASS_7 using function.


//check number is present or not
#include<stdio.h>
void Search(int*,int);
void main(){
    int a[5];
    int no;
    printf("Enter number");
    scanf("%d",&no);
    printf("Enter element of array");
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    Search(a,no);
    
   
    
}

void Search(int*a,int no){
    int index=-1;
     for(int i=0;i<5;i++){
        if(a[i]==no){
        index=i;
       break;
    }
   }
    if(index==-1){
        printf("element not found");
    }
    else{
        printf("element found at %d",index);
    } 

}