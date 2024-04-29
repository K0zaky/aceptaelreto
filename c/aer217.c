#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);
    while (n!=0)
    {
        int resto=n%2;

        if (resto==0){
            printf("%s\n","DERECHA");
        }else
            printf("%s\n","IZQUIERDA");

        scanf("%d", &n);
    }
    
}