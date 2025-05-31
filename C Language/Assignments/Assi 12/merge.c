//
#include<stdio.h>
#include<stdlib.h>
void Merge(int*,int*,int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*7);
    int *b=(int*)malloc(sizeof(int)*3);
    int c[10];
    
       printf("Enter first array");

    for(int i=0;i<7;i++){
        scanf("%d",&a[i]);
        c[i]=a[i];
    }
    printf("Enter second array");
    for(int i=0;i<3;i++){
        scanf("%d",&b[i]);
        c[i+7]=b[i];

    }
    Merge(a,b,c);
    free(a);
    free(b);
    
   
}
void Merge(int *a,int*b,int* c){
    
     printf("Merge array");
    for(int i=0;i<10;i++){
        printf("%d ",c[i]);


    }

}