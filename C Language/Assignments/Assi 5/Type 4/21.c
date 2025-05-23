//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the 
//desired operations.

//assignment 2

#include<stdio.h>
int operator(int,int,char);
void main(){
    int n1, n2;
    printf("Enter two number");
    scanf("%d%d",&n1,&n2);
    char c;
    printf("Choose the operator(+,-,/,*)");
    scanf(" %c",&c);
    int b=operator(n1,n2,c);
     if(c=='+'||c =='-'||c =='*'||c=='/')
     printf("%d",b);
     else
    printf("inavalid operator");




}
int operator(int n1, int n2, char c ){
    if(c=='+')
    return n1+n2;
    if(c=='-')
    return n1-n2;
    if(c=='*')
    return n1*n2;
    if(c=='/')
    return n1/n2;
    else
    return 0;



}