import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CoffeeWithHooks extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }

    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Do you want to any condiments");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();

        }
        catch (IOException ioe){
            System.out.println("IO error trying to read you answer");
        }
        if(answer == null){
            return "no";
        }

        return answer;
    }

}
