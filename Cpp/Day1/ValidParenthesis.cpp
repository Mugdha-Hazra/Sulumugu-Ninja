class Solution {
public:
    bool isValid(string s)
    {
        if(s.size()%2==1)
        return false;

        stack<char>stk;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='('||s[i]=='['||s[i]=='{')
            {
                stk.push(s[i]);
            }
            else{
                if(stk.empty())return false;
                char k=stk.top();
                if((s[i]==')'&&k=='(')||(s[i]==']'&&k=='[')||(s[i]=='}'&&k=='{'))
                stk.pop();
                else
                return false;
            }
        }
        return stk.empty();
        
    }
};
