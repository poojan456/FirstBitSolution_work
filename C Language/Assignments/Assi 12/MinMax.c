//find the max element from array
#include<stdio.h>
#include<stdlib.h>

void MinMax(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*7);
    printf("Enter element of array");
    for(int i=0;i<7;i++){

        scanf("%d",&a[i]);

    }
    MinMax(a);
    free(a);
    

}
void MinMax(int a[]){
    int max=1;
    for(int i=0;i<7;i++){
        if(a[i]>max){
            max=a[i];
        }
    }


    printf("maximum element is %d\n",max);

   
    int min=15;
    for(int i=0;i<5;i++){
        if(a[i]<min){
            min=a[i];
        }
    }
    printf("minimum element is  %d",min);

}