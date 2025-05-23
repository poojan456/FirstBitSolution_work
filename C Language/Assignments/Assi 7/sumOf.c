#include<stdio.h>
void main(){
    int a[7];
    for(int i=0;i<6;i++){
        scanf("%d",&a[i]);
    }
     int sum=0;
    for(int i=0;i<6;i++){
       
        sum=sum+a[i];
       
    }
     printf("%d",sum);
}
    