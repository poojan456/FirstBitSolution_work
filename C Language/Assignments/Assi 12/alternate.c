
//alternate element 
#include<stdio.h>
#include<stdlib.h>
void Alternate(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*5);
    printf("Enter element of array");
    for(int i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    Alternate(a); 
}
void Alternate(int*a){
    for(int i=0;i<=5;i+=2){
        printf("%d ",a[i]);
    }

}