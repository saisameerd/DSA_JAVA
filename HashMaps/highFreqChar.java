
import java.util.HashMap;
public class highFreqChar {
    public static void main(String[] args) throws Exception {
        // writeyourcodehere
        String s = "zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc";

        HashMap<Character,Integer>hm = new HashMap<>();
         
        for(int i = 0 ;i <s.length() ;i++){
            char ch = s.charAt(i);

            hm.put(ch , hm.getOrDefault(ch,0)+1);
        }

        int maxFreq = -1;
        char maxChar = '*';

        for(Character ch: hm.keySet()){
            int val = hm.get(ch);

            if(maxFreq < val){
                maxFreq = val;
                maxChar = ch ;
            }

        
        }

        System.out.println(maxChar);
        
    }
}
