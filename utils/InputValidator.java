package utils;

public class InputValidator {

    public static   boolean isValideInput(String text){
        if(text == null  || text.isEmpty()){
            System.out.println("ERROR : TEXT SHOULD NOT BE ENPTY.");
            return false;
        }
        return false;
    }
    
}
