//Print numbes from 1 to 10.
//assigment 3
#include<stdio.h>
int range(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    range(n);
   

}
int range(int n){
    for(int i=0;i<=n;i++){
       // return i;
        printf("%d\n",i);

    }
    return 0;

}