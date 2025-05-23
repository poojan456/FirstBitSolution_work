//fibo
#include<stdio.h>
void fibo(int);
void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    fibo(n);

}
void fibo(int n){
    
    int a=0, b=1;
    for(int i=2;i<n;i++){
        int c=a+b;
        printf("%d\t",c);
        a=b;
        b=c;
    }
}