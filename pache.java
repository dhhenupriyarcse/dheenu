 public class PangramExample {  
      /**  
       * @param args  
       */  
      public static void main(String[] args) {  
           String s = "The quick brown fox jumps over the lazy dog";  
           System.out.println("Is given String Pangram ? : "  
                     + isPangramString(s.toLowerCase()));  
      }  
      private static boolean isPangramString(String s) {  
           if (s.length() < 26)  
                return false;  
           else {  
                for (char ch = 'a'; ch <= 'z'; ch++) {  
                     if (s.indexOf(ch) < 0) {  
                          return false;  
                     }  
                }  
           }  
           return true;  
      }  
 }  



