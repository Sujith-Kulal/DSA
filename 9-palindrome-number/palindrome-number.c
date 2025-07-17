bool isPalindrome(int x) {

    long r=0;
    int d=0;
    int o=x;

    if(x < 0)
    {
        return false;
    }

while(x!=0)
{
    d=x % 10;
    r=r * 10 +d;
    x=x/10;
}
return r==o;
}

    
