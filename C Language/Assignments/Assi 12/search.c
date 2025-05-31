
//check number is present or not
#include<stdio.h>
#include<stdlib.h>
void Search(int*,int);
void main(){
    int *a=(int*)malloc(sizeof(int)*5);
    int no;
    printf("Enter number");
    scanf("%d",&no);
    printf("Enter element of array");
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    Search(a,no);
    free(a);
    
   
    
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