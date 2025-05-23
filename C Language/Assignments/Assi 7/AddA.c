#include<stdio.h>
void main(){
    int a[5],b[5],c[5];
    printf("Enter first array");
    for(int i=0;i<5;i++){
        
        scanf("%d",&a[i]);
    }
    printf("Enter second array");
    for(int i=0;i<5;i++){
        
        scanf("%d",&b[i]);
    }
    printf("sum of two array ");
    for(int i=0;i<5;i++){
        c[i]=a[i]+b[i];
        printf("%d ",c[i]);
    }
    
}
