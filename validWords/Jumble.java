import java.util.*;
import java.io.*;

public class Jumble
{
    LinkedList <String> permutations = new LinkedList<String>();
    ArrayList<String> validWords = new ArrayList<String>();
    HashSet<String> dictionary = new HashSet<String>();
    //question one uses permute, readIn, isJumble
    //question two uses duplicates
    
    private void permute(String prefix, String word){
        int n = word.length();
     if(n == 0){
       if(!permutations.contains(prefix))
       prefix = prefix.replaceAll("\\s+","");
       permutations.add(prefix);
    }else {      
    for (int i = 0; i < n; i++){
        permute(prefix + word.charAt(i), word.substring(0,i)+
        word.substring(i+1,n));  
    }
    }
}

private void readIn(String s){
      try{
       Scanner fileScanner = new Scanner (new File ("EnglishWordList.txt"));
       while(fileScanner.hasNext()){
           String word = fileScanner.next();
           word = word.replaceAll("\\s+","");
           int k = word.length();
           //only adds words that are of a certain length 
           if (word.length() ==  s.length()){
           dictionary.add(word);
        }
       
    }
       
}catch (IOException e)
    {System.out.println("file error");
    }
    
}
  
      public void isValidJumble(String s) {
        permute(" ", s);
        readIn(s);
        for(int i=0; i<permutations.size(); i++){
            if(dictionary.contains(permutations.get(i))){
            validWords.add(permutations.get(i));    
            }}
            System.out.print(validWords);
        } 
        
    public void duplicates(){
        int i=0;
       Map<String, Integer> number = new HashMap<String, Integer>();
        ArrayList<String> words = new ArrayList<String>();   
        try{
            Scanner fileScanner = new Scanner (new File ("EnglishWordList.txt"));
        while(fileScanner.hasNext()){
            String w = fileScanner.next();
            w = w.replaceAll("\\s+","");
            words.add(w);
            
        }
        for(String x: words){
            if(number.containsKey(x)){
            number.put(x,number.get(x)+1);
        }else {
            number.put(x,1);
        }
    }
   
    for (Map.Entry<String, Integer> entry : number.entrySet()) {
        if(entry.getValue()>1)
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
}catch (IOException e){
    System.out.println("filenotfound");}
    
}
        
        
    } 
        
    
    

    

