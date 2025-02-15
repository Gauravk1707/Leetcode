class Solution {

    static final int ch = 256;
    public char repeatedCharacter(String s) {
        
        HashSet<Character> set = new HashSet<>();

        for(char c: s.toCharArray()){
            if(set.contains(c)){
                return c;
            }
            set.add(c);
        }

        return '\0';
        
    }
}