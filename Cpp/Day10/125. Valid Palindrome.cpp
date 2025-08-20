class Solution {
public:
    bool isPalindrome(string s) {
        string g;
      for(auto c:s)
      {
        if(isalnum(c))
        g+=tolower(c);
      }
      string t=g;
      cout<<t<<":"<<g;
      reverse(t.begin(),t.end());
      return t==g;
    }
};
