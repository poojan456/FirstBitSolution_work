#include <stdio.h>
#include <stdlib.h>

void Prime(int*);
void main(){
    int *a=(int*)malloc(sizeof(int)*6);
    
    for(int i=0;i<6;i++) {
        scanf("%d", &a[i]);
    }
    prime(a);
    free(a);

    
}
void prime(int a[]){
    for(int i=0;i<6;i++) {
        int num=a[i];
        int flag=0;
        if(num<2) {
            flag=1;
        } 
        else{

            for(int j=2;j<num;j++) {
                if(num%j==0) {
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0) {
            printf("%d ",num);
        }
    }

}