// sum of all number
#include<stdio.h>
#include<stdlib.h>
int sumOf(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*7);
    for(int i=0;i<6;i++){
        scanf("%d",&a[i]);
    }
    int k=sumOf(a);
    printf("%d",k);
    free(a);
}
int sumOf(int*a){
    
    int sum=0;
    for(int i=0;i<6;i++){
       
        sum=sum+a[i];
       
    }
    return sum;
}