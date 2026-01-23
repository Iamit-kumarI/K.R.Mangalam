/*
* Problem: Decode String
* Solution:https://leetcode.com/problems/decode-string/submissions/1894038327/
*/
import java.util.*;
class Problem1 {
    public String decodeString(String s) {
        Stack<Integer>intStack=new Stack<>();
        Stack<StringBuilder>stringStack=new Stack<>();
        StringBuilder current=new StringBuilder();
        int k=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }else if(c=='['){
                intStack.push(k);
                stringStack.push(current);
                current=new StringBuilder();
                k=0;
            }else if(c==']'){
                int n=intStack.pop();
                StringBuilder prev=stringStack.pop();
                for(int i=0;i<n;i++){
                    prev.append(current);
                }
                current=prev;
            }else current.append(c);
        }
        return current.toString();
    }
}

        /* //failing case 3[a2[c]]
        Stack<Character>stack=new Stack<>();
        Stack<Character>characterStack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        StringBuilder cur=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='[')continue;
            else if(Character.isDigit(c)){
                stack.push(c);
            }else if(Character.isAlphabetic(c)){
                characterStack.push(c);
            }else{
                while(!stack.isEmpty())cur.append(stack.pop());
                int n=Integer.parseInt(cur.reverse().toString());
                cur.setLength(0);
                while(!characterStack.isEmpty())cur.append(characterStack.pop());
                String temp=cur.reverse().toString();
                while(n-->0){
                    ans.append(temp);
                }
            }
            cur.setLength(0);
        }
        if(!characterStack.isEmpty()){
            while(!characterStack.isEmpty())cur.append(characterStack.pop());
        }
        ans.append(cur.reverse().toString());
        return ans.toString();
    }
} */
