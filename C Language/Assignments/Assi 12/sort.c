#include<stdio.h>
#include<stdlib.h>
void Sort(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*4);
    
    for(int i=0;i<4;i++){
        
        scanf("%d",&a[i]);
    }
    Sort(a);
    free(a); 
}

void Sort(int *a){
    int temp;
    for(int i=0;i<4;i++){
        for(int j=0;j<3;j++){
            if(a[j]>a[j+1]){
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           
        }
        
        }  
    }
    for (int i=0;i<4;i++) {
        printf("%d ",a[i]);
    }
     
}


    