#include<stdio.h>
void Reverse(int*,int);
void main(){
    int size;
    
    printf("Enter size of array");
    scanf("%d",&size);

    int arr[size];
    printf("Enter element of array");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);

    }
    Reverse(arr,size);
   
}
void swap(int* a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}   
void Reverse(int* arr,int size){
        int l=0;
        int r=size-1;
        while(l<r){
            swap(&arr[l],&arr[r]);
            l++;
            r--;
        }
        printf("The reverse array\n");
        for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
        
}
    
    


   

