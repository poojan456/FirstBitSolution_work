//perfect
#include<stdio.h>
void isPerfect(int*);
void main(){
    int i;
    isPerfect(&i);

}
void isPerfect(int* i){
     for(int q=1;q<=1000;q++){
        int *i=1;
        int sum=0;
        while(*i<=q/2){
            if(q%*i==0){
                sum=sum+*i;
                

            }
            *i++;
        }
        if(sum==q){
            printf("%d\n",q);
        }
    }

}