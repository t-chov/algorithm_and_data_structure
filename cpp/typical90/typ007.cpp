#include <bits/stdc++.h>
#include <math.h>
using namespace std;

int main()
{
    int N, Q;
    cin >> N;
    vector<int> A(N);
    for (int i = 0; i < N; i++)
    {
        cin >> A[i];
    }
    sort(A.begin(), A.end());
    cin >> Q;
    int b;
    for (int j = 0; j < Q; j++)
    {
        cin >> b;
        auto iter = lower_bound(A.begin(), A.end(), b);
        int pos = distance(A.begin(), iter);
        if (pos == 0)
        {
            cout << abs(A[pos] - b) << endl;
        }
        else
        {
            int abs1 = abs(A[pos] - b);
            int abs2 = abs(A[pos - 1] - b);
            cout << min(abs1, abs2) << endl;
        }
    }
}
