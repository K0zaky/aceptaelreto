#include <iostream>
using namespace std;

int main() {
    int n1;
    int n2;
    char l1;

    cin >> n1;
    cin >> n2;
    while (n1!=0 && n2!=0){
        if (n1==1){
            l1='h';
        }else if(n1==2){
            l1='g';
        }else if(n1==3){
            l1='f';
        }else if(n1==4){
            l1='e';
        }else if(n1==5){
            l1='d';
        }else if(n1==6){
            l1='c';
        }else if(n1==7){
            l1='b';
        }else if(n1==8){
            l1='a';
        }

        cout << l1 << n2 << endl;

        cin >> n1;
        cin >> n2;
    }
    return 0;
}