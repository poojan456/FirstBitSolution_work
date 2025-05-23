//factorial
 //Find factorial of number.

 #include<stdio.h>
 int facto(int);
 void main(){
    int n;
    printf("Enter the number");
    scanf("%d",&n);
    int l=facto(n);
    printf("%d",l);

 }
 int facto(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;

    }
    return fact;

 }