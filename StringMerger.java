public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

     
     if (s.equals("")) {
      return part1.equals("") && part2.equals("");
     } else {
      boolean isMerge1 = false, isMerge2 = false;
      if (part1.length() > 0 && s.charAt(0) == part1.charAt(0))
         isMerge1 = isMerge(s.substring(1).trim(), part1.substring(1).trim(), part2.trim());
      if (part2.length() > 0 && s.charAt(0) == part2.charAt(0))
         isMerge2 = isMerge(s.substring(1).trim(), part1.trim(), part2.substring(1).trim());
      return isMerge1 || isMerge2;
     }

  
   }
 

}

