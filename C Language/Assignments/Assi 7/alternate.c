//alternate element 
#include<stdio.h>
void main(){
    int a[5];
    printf("Enter element of array");
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<=5;i+=2){
        printf("%d ",a[i]);
    }
}
 