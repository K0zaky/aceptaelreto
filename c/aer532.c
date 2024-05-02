#include <stdio.h>

int main() {
    int n;
    int n1, n2;

    scanf("%d", &n);
    for (; n > 0; n--) {
        scanf("%d", &n1);
        scanf("%d", &n2);

        int d=n2-n1;

        printf("%d\n", d);
    }

    return 0;
}
