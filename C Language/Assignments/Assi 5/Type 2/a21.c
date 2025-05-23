// using type 2
#include<stdio.h>
int operator();
void main(){
    int res=operator();

    
       
    printf("%d",res);

     

    
    

}
int operator(){

    int a,b,res;
    char p;
    printf("Enter two number\n");
    scanf("%d%d",&a,&b);
   
    printf("Choose the operator(+,-,*,/)");
    fflush(stdin);
    scanf(" %c",&p);
    if(p=='+'){
       return res=a+b;  
    }
    else if(p=='-'){
       return res=a-b;
    }
    else if(p=='*'){
       return res=a*b;
    }
    else if(p=='/'){
       return res=a/b;
    }
    else{
       return res=a%b;
    }
   

}