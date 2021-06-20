#include <bits/stdc++.h>
using namespace std;

int main()
{
    string S;
    cin >> S;
    int N = S.size();

    for (int i = 0; i < N; i++)
    {
        for (int j = i + 1; j < N; j++)
        {
            if (S[i] == S[j])
            {
                cout << "no" << endl;
                return 0;
            }
        }
    }
    cout << "yes" << endl;
}