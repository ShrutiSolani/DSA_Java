// Given a run-length encoded lowercase alphabet string s, implement an iterator which is the decoded version of s:

// next() polls the next element in the iterator
// hasnext() which returns whether the next element exists

import java.util.*;

class RunLengthDecodedIterator {
    class Alphabet{
        
        char c;
        long count;

        public Alphabet(char c, long count) {
            this.c = c;
            this.count = count;
        }
    }

    LinkedList<Alphabet> list;
    int index = 0;

    public RunLengthDecodedIterator(String s) {
        int i = 0;
        list = new LinkedList();
        while(i < s.length()){
            StringBuilder str = new StringBuilder();
            int j = i;
            while(j < s.length()){
                if(Character.isDigit(s.charAt(j))){
                    str.append(s.charAt(j));
                }
                else{
                    break;
                }
                j++;
            }
            int limit = Integer.parseInt(str.toString());
            Alphabet x = new Alphabet(s.charAt(j), limit);
            
            list.add(x);
            i = j+1;
        }

    }

    public String next() {
        if (list.size() == 0){
            return "";
        }
        Alphabet ch = list.get(index);
        if (ch.count == 1) {
            list.remove(index);
            return Character.toString(ch.c);
        }
        ch.count -= 1;
        return Character.toString(ch.c);    
    }

    public boolean hasnext() {
        if(list.size() > 0){
            return true;
        }
        return false;
    }
}
