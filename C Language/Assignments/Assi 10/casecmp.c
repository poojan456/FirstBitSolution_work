//mystrcasecmp - compare to string ignoring capital and small like Pooja or pooja it return 0 means equal
#include<stdio.h>
#include<string.h>
int mystrcasecmp(char*,char*);
void main(){
    char str1[]="POOja";
    char str2[]="pooJa";
    int x=mystrcasecmp(str1,str2);
    printf("%d",x);
}
int mystrcasecmp(char* str1,char*str2){
    int i=0,flag;
    while(str1[i]!='\0'){
        
        if(str1[i]==str2[i] || str1[i]-str2[i]==-32||str1[i]-str2[i]==32){
            flag=0;
        }
        else{
            return 1;
        }
        i++;
    }
    return flag;

}

