
#include<stdio.h>
int SumOf(int*,int*,int*,int); 
void main() {
    int a[5], b[5], c[5];
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
}

int SumOf(int *a,int *b,int*c,int size) {
    int total=0;
    for(int i=0;i<size;i++) {
        c[i]=a[i]+b[i];
        total+=c[i];  
    }
    return total;
}
