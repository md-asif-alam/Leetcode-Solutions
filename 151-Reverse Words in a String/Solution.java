class Solution {
    public String reverseWords(String s) {
        
        String[] words=s.split("\\s+");//for multiple spaces between two words
        
        String rev="";
        
        for(int i=words.length-1;i>=0;i--)
        {
            rev=rev+words[i];
            rev=rev+" ";
        }
        
        return rev.trim();
    }
}