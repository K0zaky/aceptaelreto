#include <stdio.h>

int main() {
    int n;
    char e[100];
    int n1, n2;

    scanf("%d", &n);
    getchar();

    for (; n > 0; n--) {
        fgets(e, sizeof(e), stdin);
        sscanf(e, "%d / %d", &n1, &n2); 

        if (n1 > n2 || n1 == n2) {
            printf("BIEN\n");
        } else {
            printf("MAL\n");
        }
    }
    return 0;
}
