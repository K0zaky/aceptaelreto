#include <stdio.h>

int main() {

    int n;
    scanf("%d", &n);
    while (n!=0)
    {
        for ( ; n > 0; n--){
            printf("%d", 1);
        }
        printf("\n");
        scanf("%d", &n);
    }
    
}