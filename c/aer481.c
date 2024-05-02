#include <stdio.h>

int main() {

    int n1;
    int n2;
    char l1;

    scanf("%d %d", &n1, &n2);

    while (n1!=0 && n2!=0){
        if (n1==1){
            l1='h';
        }else if(n1==2){
            l1='g';
        }else if(n1==3){
            l1='f';
        }else if(n1==4){
            l1='e';
        }else if(n1==5){
            l1='d';
        }else if(n1==6){
            l1='c';
        }else if(n1==7){
            l1='b';
        }else if(n1==8){
            l1='a';
        }

        printf("%c%d\n", l1, n2);
        scanf("%d %d", &n1, &n2);
    }
    return 0;
    
    
}