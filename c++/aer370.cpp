#include <iostream>
#include <sstream>

using namespace std;

int main() {
    int n;
    string e;
    int n1, n2;

    cin >> n;
    getline(cin, e);

    for (int i = 0; i < n; ++i) {
        getline(cin, e);

        istringstream ss(e);
        char d;
        ss >> n1 >> d >> n2;

        if (n1+1==n2||n1==n2+1) {
                if (n1<n2) {
                    if (n1%2==0) {
                        cout << "SI" << endl;
                    }else{
                        cout << "NO" << endl;
                    }
                }else if(n2<n1){
                    if (n2%2==0) {
                        cout << "SI" << endl;
                    }else{
                        cout << "NO" << endl;
                    }
                }
            }else{
                cout << "NO" << endl;
            }
    }
    return 0;
}
