class Solution { 
    public boolean isPalindrome(String s) { 
        String ns = "";  
        for(int i = 0; i < s.length(); i++){ 
            char ch = s.charAt(i);  
            if(Character.isLetterOrDigit(ch)){ 
                ns = ns + Character.toLowerCase(ch); 
            } 
        } 
        
        int l = 0, r = ns.length() - 1; 
        while(l < r){ 
            if(ns.charAt(l) == ns.charAt(r)){ 
                l++; 
                r--; 
            } else { 
                return false; 
            } 
        } 
        return true;  
    } 
}
