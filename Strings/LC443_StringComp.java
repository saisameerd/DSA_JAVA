public class LC443_StringComp {
    class Solution {
        public int compress(char[] chars) {
            String s;
            int freq = 1;
            int i = 0;
            int j = 1;
            while( j <= chars.length){
                if(j!=chars.length && chars[j] == chars[j-1]){
                    freq++;
                }else{
                    chars[i++]= chars[j-1];
                    if(freq > 1){
                        s = String.valueOf(freq); 
                        for(int  k = 0 ; k < s.length() ; k++){
                            chars[i++] = s.charAt(k);
                        }
                    }  
                    freq = 1;
                }            
                j++;
            } 
            return i ;
            }
    }
}
