//

#include<stdio.h>
#include<stdlib.h>
void EvenOdd(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*8);
    printf("Enter element of array");
    for(int i=0;i<8;i++){

        scanf("%d",&a[i]);

    }
    EvenOdd(a);
    free(a);
    
    
}
void EvenOdd(int*a){
    printf("Even number in this array-");
    int d=1;
    for(int i=0;i<8;i++){
        if(a[i]%2==0){
            d=a[i];
            printf("%d ",d);
        }
    }
    printf("\n");
    printf("Odd number are-");
    for(int j=0;j<8;j++){
        if(a[j]%2!=0){
            d=a[j];
            printf("%d ",d);
        }
    }

}