#include <stdio.h>

int main() {
    int n;
    int num1;
    int n2;

    scanf("%d", &n);
    for (; n > 0; n--) {
        scanf("%ld", &num1);
        int n2 = num1 * 2;
        printf("%d %d\n", num1, n2);
    }
    return 0;
}
