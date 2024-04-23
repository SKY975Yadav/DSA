class Examples{
    boolean checkPangram(String st){
        int n= st.length();
        if (n<26) return false;
        int [] visited = new int[26];
        for (int i = 0; i <n ; i++) {
            char x = st.charAt(i);
            if (x>='a' && x<='z'){
                visited[x-'a'] = 1;
            }
            if (x>='A' && x<='Z'){
                visited[x-'A'] = 1;
            }
        }
        for (int x: visited){
            if (x==0) return false;
        }
        return true;
    }
    void patternSearch(String text,String pattern){
        int pos = text.indexOf(pattern);
        while (pos>=0){
            System.out.println(pos+" ");
            pos = text.indexOf(pattern,pos+1);
        }
    }
    void digitAfterDecimal(String str){
        int ind = str.indexOf('.');
        if (ind<0) System.out.println();
        else System.out.println(str.substring(ind+1));//,ind+3 if we want only two digits
    }
    char findExtraChar(String str1,String str2){
        //Second string contain one extra character we have to find that
        int res = 0;
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            res = res ^ str1.charAt(i) ^ str2.charAt(i);
        }
        res = res ^ str2.charAt(len);
        return (char )res;
    }
    //s1 = G.SaiKrishna, s2 = Sai
    //m= 12 , n = 3
    //n<m then temp = sai, then s2=s1= G.SaiKrishna, then s1 = temp = Sai
    //So now s1 = Sai , s2 = G.SaiKrishna , n = 12 ,m =3
    // ind = 2 ,then res = 2 + substring of ind+m i.e =Krishna.length() = 7
    //res = 7+2
    int AlmostEqual(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        System.out.println(m +" "+ n);
        if (m==n) return 0;
        int res;
        if (n<m){
            String temp = s2;
            s2 = s1;
            s1 = temp;
            int k = n;
            n=m;
            m=k;
        }
//        int ind = s2.indexOf(s1);
//        if (ind<0) return -1;
//        res = ind + s2.substring(ind+m).length();
//        return res;
        if (s2.contains(s1)) {
            return n - m;
        }
        return -1;
    }
    public void follPatt(String s)
    {
        // 0 means false 1 means true
        //Your code here
        int res = 1;
        int x = 0 , y = 0;
        for(char ch : s.toCharArray()){
            if(ch=='x'){
                if(y!=0){
                    res = 0;
                    break;
                }
                x++;
            }
            else if(ch=='y') y++;
            if(y>x){
                res = 0;
                break;
            }
            if(x==y){
                x=0;
                y=0;
            }

        }
        if(x!=y) res = 0;
        System.out.print(res);
        System.out.println();
    }
}
public class Problems {
    public static void main(String[] args) {
        Examples ex = new Examples();
        System.out.println(ex.checkPangram("ABCDEFGHIJKLMNOpqrstuvwxyz"));
        ex.patternSearch("sai Krishna sai yadav","sai");
        ex.digitAfterDecimal("34.3434");
        char s = ex.findExtraChar("Hi This is Sai Krishna","MHi This is Sai Krishna");
        System.out.println(s);
        System.out.println(ex.AlmostEqual("cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpudniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs","cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu"));
        ex.follPatt("xxxyyyxyyy");
    }
}
