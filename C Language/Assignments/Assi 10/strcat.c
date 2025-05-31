#include<stdio.h>
void MystrCat(char[],char[]);
void main(){
    char s1[20]="good";
    char s2[20]="morning";

    MystrCat(s1,s2);

}
void MystrCat(char s1[],char s2[]){
    char res[20];
    for(int i=0;i<=3;i++){
        
        res[i]=s1[i];
    }
    for(int i=0;i<=6;i++){
        
        res[ i+4]=s2[i];

    }
    printf("%s ",res);
    

}