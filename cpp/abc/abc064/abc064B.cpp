#include <bits/stdc++.h>
using namespace std;

int main()
{
    int N, a;
    cin >> N;
    int min = 1001;
    int max = -1;
    for (int i = 0; i < N; i++)
    {
        cin >> a;
        if (a < min)
            min = a;
        if (max < a)
            max = a;
    }
    cout << max - min << endl;
}