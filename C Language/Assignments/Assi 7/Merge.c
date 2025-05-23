#include<stdio.h>
void main(){
    int a[7],b[3];
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
    printf("Merge array");
    for(int i=0;i<10;i++){
        printf("%d ",c[i]);


    }
}
