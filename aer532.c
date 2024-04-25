#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    char nums[100];
    int n1, n2;
    char *token;

    scanf("%d", &n);
    for (; n > 0; n--) {
        scanf("%s", nums);

        token = strtok(nums, " ");
        if (token != NULL) {
            n1 = atoi(token);
        }

        token = strtok(NULL, " ");
        if (token != NULL) {
            n2 = atoi(token);
        }

        // Restar n1 de n2 para obtener la diferencia correcta
        int resultado = n1 - n2;
        printf("%d\n", resultado);
    }

    return 0;
}
