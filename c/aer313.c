#include <stdio.h>

int main() {

    int n;
    int n1;
    int n2;
    int s;

    scanf("%d", &n);
    for( ; n > 0; n--) {
        scanf("%d", &n1);
        scanf("%d", &n2);
        s=n1+n2;

        if (s>=0){
            printf("%s\n", "SI");
        }else{
            printf("%s\n", "NO");
        }

    }
}