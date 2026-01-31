package Assignments.LabAssignment4;

public class Task12 {
    public static void main(String[] args) {
        String str=" suMan kUmAr daS ";
        StringBuilder sb=new StringBuilder();
        char lastChar='1';
        for(char c:str.toCharArray()){
            if(lastChar==' '&&c==' ')continue;
            if((lastChar=='1'||lastChar==' ')&&c!=' ')sb.append((char)(c&'_'));//c.toUpperCase()
            if(lastChar!='1'&&lastChar!=' ')sb.append((char)(c|' '));//c.toLowerCase ~, bit manupulation little bit faster
            lastChar=c;
        }
        System.out.println(sb.toString());
    }
}
