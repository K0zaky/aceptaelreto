#include <stdio.h>

int main() {

    long n, dia, mes;

    scanf("%ld", &n);
    for( ; n > 0; n--) {
        scanf("%ld", &dia);
        scanf("%ld", &mes);
        if(dia == 25 && mes == 12) {
            printf("SI\n");
        } else {
            printf("NO\n");
        }
    }
}
