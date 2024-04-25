#include <stdio.h>

int main() {

    long n;
    int n1;
    int n2;
    int n3;
    int d;

    scanf("%ld", &n);
    for( ; n > 0; n--) {
        scanf("%d", &n1);
        scanf("%d", &n2);
        scanf("%d", &n3);
        d=n2*n3;

        if (d>n1){
            printf("%s\n", "HORAS");
        }else if (d<n1){
            printf("%s\n", "ENCENDIDOS");
        }else{
            printf("%s\n", "AMBAS");
        }
        
    }
}
