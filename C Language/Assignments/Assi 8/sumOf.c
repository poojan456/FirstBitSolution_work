// sum of all number
#include<stdio.h>
int sumOf(int*);
void main(){
    int a[7];
    for(int i=0;i<6;i++){
        scanf("%d",&a[i]);
    }
    
    int k=sumOf(a);
    printf("%d",k);
}
int sumOf(int*a){
    
    int sum=0;
    for(int i=0;i<6;i++){
       
        sum=sum+a[i];
       
    }
    return sum;
}