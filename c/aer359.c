#include <stdio.h>

int main() {
    int n;
    int m;
    int i;

    scanf("%d", &n);

    for (i = 0; i < n; ++i) {
        int s = 0;
        int c = 0;
        
        while (1) {
            if (scanf("%d", &m) != 1) {
                return 1;
            }
            if (m == -1) {
                break;
            }
            s += m;
            c++;
        }

        if (s < c) {
            printf("Timo\n");
        } else if (s == c) {
            printf("Justo\n");
        } else {
            printf("Suerte\n");
        }
    }

    return 0;
}