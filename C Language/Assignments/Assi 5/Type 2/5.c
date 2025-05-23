// type 2
#include<stdio.h>
char Conversion();
void main(){
    char p=Conversion();

    printf("%c",p);

}
char ch;
char Conversion(){
    
    printf("Enter any character");
    scanf(" %c", &ch);
    if(ch>='a'&& ch<='z'){
        ch=ch-32;
        return ch;
        
    }
    else if(ch>='A'&& ch<='Z'){
        ch=ch+32;
        return ch;
        
    }
    else if(ch>='0'&&ch<='9') {
        return ch;
    }


}