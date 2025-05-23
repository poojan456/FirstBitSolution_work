//check number is present or not
#include<stdio.h>
void main(){
    int a[5];
    printf("Enter element of array");
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    int no;
    int index=-1;
    printf("Enter number");
    scanf("%d",&no);
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