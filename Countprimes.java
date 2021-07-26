class Solution {
public int countPrimes(int n) {
int s[] = new int[n];
for (int i=2; i <n; i++)
{
for(int j=i+i;j<n;j=j+i)
{
s[j]=1;
}

    }
    int result=0;
    for(int i=2;i<s.length;i++)
    {
        if(s[i]==0)
        {
            result++;
        }
    }
      return result;
}
}
