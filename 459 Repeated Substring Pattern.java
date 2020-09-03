class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = length/2; i>=1; i--){
            if(length%i == 0){
                int repeat = length/i;
                String str = s.substring(0,i);
                StringBuilder cmp = new StringBuilder();
                for(int j=0; j<repeat; j++){
                    cmp.append(str);    
                }
                if(cmp.toString().equals(s)){
                   return true; 
                }
            }
        }
        return false;
    }
}