#include<stdio.h>
#include<stdlib.h>
void rev(int*);
void main(){
      int *a=(int*)malloc(sizeof(int)*5);
    printf("Enter element of array");
    int i=0;
    for(;i<5;i++){
        scanf("%d",&a[i]);
    }
    rev(a); 
    free(a);
}
void rev(int*a){
     for(int i=4;i>=0;i--){
        printf("%d ",a[i]);
        
    }

}