#include<stdio.h>
void perfect();
void main(){
    perfect();

}
void perfect(){
    for(int q=1;q<=1000;q++){
        int i=1;
        int sum=0;
        while(i<=q/2){
            if(q%i==0){
                sum=sum+i;
                

            }
            i++;
        }
        if(sum==q){
            printf("%d\n",q);
        }
    }
}