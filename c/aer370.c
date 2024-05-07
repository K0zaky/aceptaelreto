#include <stdio.h>

int main() {
    int n;
    char e[100];
    int n1, n2;

    scanf("%d", &n);
    getchar();

    for (; n > 0; n--) {
        fgets(e, sizeof(e), stdin);
        sscanf(e, "%d - %d", &n1, &n2); 
        if (n1+1==n2||n1==n2+1) {
                if (n1<n2) {
                    if (n1%2==0) {
                        printf("SI\n");
                    }else{
                        printf("NO\n");
                    }
                }else if(n2<n1){
                    if (n2%2==0) {
                        printf("SI\n");
                    }else{
                        printf("NO\n");
                    }
                }
            }else{
                printf("NO\n");
            }
    }
    return 0;
}
