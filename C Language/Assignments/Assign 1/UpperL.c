
#include<stdio.h>
void main()
{
    char ch;
    printf("Enter any character");
    scanf(" %c", &ch);
    if(ch>='a'&& ch<='z'){
        
        printf(" lower case %c",ch);
        
    }
    else if(ch>='A'&& ch<='Z'){
       // ch=ch+32;
        printf(" upper case %c",ch);
        
    }
    else if(ch>='0'&&ch<='9') {
        printf("its a digit");
    }
    
}




