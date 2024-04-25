#include <stdio.h>

int main() {

    long n;
    int n1;

    scanf("%ld", &n);
    for( ; n > 0; n--) {
        scanf("%d", &n1);
        int p=n1/100;
        printf("%d\n", p);
    }
}