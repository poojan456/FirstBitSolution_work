//using type2

#include<stdio.h>
char vote();
void main(){
    char d=vote();
    if(d=='Y')
    printf("You can vote");
    else
    printf("you cannot vote");
}
char vote(){
    int age;
    printf("enter your age");
    scanf("%d",&age);
    if(age>=18){
       return 'Y';
    }
    else{
        return 'N';
    }


}