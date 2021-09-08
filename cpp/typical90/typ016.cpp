#include <bits/stdc++.h>
#include <math.h>
using namespace std;

int main()
{
    int N, A, B, C, ans, Na, Nb;
    ans = 9999;
    cin >> N;
    cin >> A >> B >> C;
    for (int a = 0; a < min(10000, N / A + 1); a++)
    {
        Na = N - A * a;
        for (int b = 0; b < min(10000 - a, Na / B + 1); b++) {
            Nb = Na - B * b;
            if (Nb % C == 0) {
                ans = min(a + b + Nb / C, ans);
            }
        }
    }
    cout << ans << endl;
}