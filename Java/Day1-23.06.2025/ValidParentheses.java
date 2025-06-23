class Solution {
    public boolean isValid(String s)
     
    {
        if(s.length()%2==1)
        return false;

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            st.push(c);
            else
            {
                if(st.empty())
                return false;
                else
                {
                    char d=st.peek();
                    if((s.charAt(i)==')'  && d=='(') || (s.charAt(i)=='}'  && d=='{') || (s.charAt(i)==']'  && d=='['))
                    st.pop();
                    else
                    return false;
                }
            } 
        }
        return st.empty();
    }
}
