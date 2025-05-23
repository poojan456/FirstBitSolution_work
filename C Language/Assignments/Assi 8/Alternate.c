
//alternate element 
#include<stdio.h>
void Alternate(int*);
void main(){
    int a[5];
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