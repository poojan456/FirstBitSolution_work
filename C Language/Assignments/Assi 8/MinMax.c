//find the max element from array
#include<stdio.h>
void MinMax(int*);
void main(){
    int a[7];
    printf("Enter element of array");
    for(int i=0;i<5;i++){

        scanf("%d",&a[i]);

    }
    MinMax(a);
    

}
void MinMax(int a[]){
    int max=1;
    for(int i=0;i<5;i++){
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