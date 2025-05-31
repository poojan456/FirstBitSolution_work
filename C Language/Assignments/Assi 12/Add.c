//Create array using malloc in Assignment 8

#include<stdio.h>
#include<stdlib.h>
int SumOf(int*,int*,int*,int); 
void main() {
    int *a=(int*)malloc(sizeof(int)*5);
    int *b=(int*)malloc(sizeof(int)*5);
    int *c=(int*)malloc(sizeof(int)*5);
    printf("Enter first array:\n");
    for(int i=0;i<5;i++) {
        scanf("%d", &a[i]);
    }

    printf("Enter second array:\n");
    for(int i=0;i<5;i++) {
        scanf("%d", &b[i]);
    }

    int totalSum=SumOf(a,b,c,5); 
    printf("sum array:");
    for(int i=0;i<5;i++) {
        printf("%d ",c[i]);
    }

    printf("total sum=%d\n",totalSum);
    free(a);
    free(b);
    free(c);
}

int SumOf(int *a,int *b,int*c,int size) {
    int total=0;
    for(int i=0;i<size;i++) {
        c[i]=a[i]+b[i];
        total+=c[i];  
    }
    return total;
}