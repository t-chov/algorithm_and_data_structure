#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x, a, b;
    cin >> x >> a >> b;
    int diff = (a * -1) + b;
    if (diff <= 0)
    {
        cout << "delicious" << endl;
    }
    else if (diff <= x)
    {
        cout << "safe" << endl;
    }
    else
    {
        cout << "dangerous" << endl;
    }
}