package model;

import java.util.ArrayList;
import java.util.HashMap;

public class WordModel {
    String[] text;
    ArrayList<Integer> count ;
    HashMap<String[] ,ArrayList<Integer> > map;
    WordModel(String[] t , ArrayList<Integer> c ,HashMap<String[] ,ArrayList<Integer> > m){
        this.text=t;
        this.count=c;
        this.map=m;
    }

    
}
