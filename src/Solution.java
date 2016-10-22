import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Balloon[] balloons = new Balloon[10];
        for(int i = 0;i<balloons.length;i++){
            balloons[i] = new Balloon();
        }
        Scanner theScan = new Scanner(System.in);
   
        int numTestCases = theScan.nextInt();
        theScan.nextLine();//Gets rid of the next line.
        
        theScan.nextLine();//Takes into account the space before more info
        
        for(int testCase = 0;testCase<numTestCases;testCase++){
            int questions = theScan.nextInt();
            int lies = theScan.nextInt();
            theScan.nextLine();
            for(int theQuestion = 0;theQuestion<questions;theQuestion++){
                ArrayList currQuestion = new ArrayList<>();
                String currLine = theScan.nextLine();
                Scanner lineScan = new Scanner(currLine);
                String questionType = lineScan.next();
                if(questionType.equals("color")){
                    while(lineScan.hasNext()) {
                        int position = lineScan.nextInt();
                        String color = lineScan.next();

                    }
                }else{

                }
            }

        }
        
        
        while(true){
            String userInput = theScan.nextLine();
            if(userInput.equals("")){
                break;//Breaks the while loop when done inputting data.
            }
        }
    }
}

class Question{
    ArrayList<Statement> statements;
    boolean isAnd;
    boolean response;
    public Question(ArrayList<Statement> statements,boolean response,boolean isAnd){

        this.statements = statements;
        this.response = response;
        this.isAnd = isAnd;
    }
    
    public void addQuestion(Statement question){
        statements.add(question);
    }
}

class Statement{
    boolean colorStatement;
    private int number;
    private String color;
    public Statement(boolean colorStatement,int number,String color){
        this.colorStatement = colorStatement;
        this.number = number;
        this.color = color;
    }    
}


class Balloon{
    public boolean redTrue;
    public boolean greenTrue;
    public boolean blueTrue;
    public boolean redFalse;
    public boolean greenFalse;
    public boolean blueFalse;
    
    
    public Balloon(){
        this.redTrue = false;
        this.greenTrue = false;
        this.blueTrue = false;
        this.redFalse = false;
        this.greenFalse = false;
        this.blueFalse = false;
    }
    
}