//type 3
//// with parameter without returntype
//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the 
//desired operations.
#include<stdio.h>
void parameter(int,int,char);
void main(){
    int a,b,res;
    
    printf("Enter two number\n");
    scanf("%d%d",&a,&b);
    char p;
   
    printf("Choose the operator(+,-,*,/)");
    scanf(" %c",&p);
    fflush(stdin);
    
    parameter(a,b,p);

}
void parameter(int a,int b,char p){
    
    int res;
    
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