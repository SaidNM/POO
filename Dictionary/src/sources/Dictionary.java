
package sources;

import java.util.ArrayList;


public class Dictionary {
    private ArrayList <Word> dictionary;

    public Dictionary() {
        dictionary = new ArrayList <>();
    }

    public void add(String english,String spanish){
        dictionary.add(new Word(english,spanish));
    }

    public ArrayList<Word> getDictionary() {
        return dictionary;
    }
    
    
    
    
}
