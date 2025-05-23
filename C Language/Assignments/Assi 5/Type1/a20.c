
#include<stdio.h>
void operator();
void main(){
    operator();

}
void operator(){
    int a,b,res;
    char p;
    printf("Enter two number\n");
    scanf("%d%d",&a,&b);
   
    printf("Choose the operator(+,-,*,/)");
    fflush(stdin);
    scanf(" %c",&p);
    if(p=='+'){
        res=a+b;  
    }
    else if(p=='-'){
        res=a-b;
    }
    else if(p=='*'){
        res=a*b;
    }
    else if(p=='/'){
        res=a/b;
    }
    else{
        res=a%b;
    }
    printf("The result is %d", res);
}