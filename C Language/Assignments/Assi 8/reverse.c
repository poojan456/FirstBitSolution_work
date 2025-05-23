#include<stdio.h>
void rev(int*);
void main(){
      int a[5];
    printf("Enter element of array");
    int i=0;
    for(;i<5;i++){
        scanf("%d",&a[i]);
    }
    rev(a); 
}
void rev(int*a){
     for(int i=4;i>=0;i--){
        printf("%d ",a[i]);
        
    }

}