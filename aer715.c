#include <stdio.h>

int main() {

    long n;
    int n1;
    int n2;

    scanf("%ld", &n);
    for( ; n > 0; n--) {
        scanf("%d", &n1);
        scanf("%d", &n2);
        int p=n1/n2;
        if (p>=12){
            printf("%s\n", "SI");
        }else{
            printf("%s\n", "NO");
        }
    }
}