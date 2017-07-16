/*
 *This program demonstrates a result processing system
 * where we display  student information along with marks obtained 
 */
package resultprocessor;
    
import java.util.Scanner;

public class ResultProcessor {                                    // variable declaration section
    static final String  CLASS_X="10";                           //constant declaration for student's class since all students are in class 10
    String rollnumber;                                          // student's rollnumber               
    String name;                                               //  student's name
    String std_class;                                          // student's class
    String result;                                             // student's result
    int score_math;                                            // score in math
    int score_science;                                         // score in science 
    int score_hindi;                                           // score in hinidi
    int score_english;                                         // score in english
    int score_gk;                                              // score in G,K
    
                                                                //Getter methods
    public String getRollnumber() {                             // to get Roll number
        return rollnumber;
    }


    public String getName() {                                  // to get student name 
        return name;
    }


    public int getScore_math() {                                // to get math marks
        return score_math;
    }


    public int getScore_science() {                            // to get science marks
        return score_science;
    }


    public int getScore_hindi() {                              // to get hindi marks
        return score_hindi;
    }


    public int getScore_english() {                            // to get english marks
        return score_english;
    }


    public int getScore_gk() {                                 // to get GK marks 
        return score_gk;
    }
    
    public String getStd_class() {                             // to get student's class
        return std_class;
    }

       

    public ResultProcessor(String rollnumber, String name,                   // parameterized constructor so that we can set data                                                                                
            String std_class, String result,                                 // members during object initialization
            int score_math, int score_science, 
            int score_hindi, int score_english, int score_gk) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.std_class = std_class;
        this.result = result;
        this.score_math = score_math;
        this.score_science = score_science;
        this.score_hindi = score_hindi;
        this.score_english = score_english;
        this.score_gk = score_gk;
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {

    ResultProcessor[] student= new ResultProcessor[3];                              // array of object created each will store a set of values
    student[0]=new ResultProcessor("1","vansh",CLASS_X,"pass",10,10,10,10,10);             // Object array's 0th index being initialized
    student[1]=new ResultProcessor("2","akashdubey",CLASS_X,"fail",1,1,1,1,1);             // Object array's 1st index being initialized
    student[2]=new ResultProcessor("3","NEELAM",CLASS_X,"pass",7,7,7,7,7);            // Object array's 2nd index being initialized
    
        System.out.println("===================================================");
        System.out.println("          Student Result ");
        System.out.println("===================================================");
    
        for (ResultProcessor index:student) {                                          // used for-each loop and looping through array of object student            
                                                                                       // using index which is of class type ResultProcessor
            System.out.println(" Name           : "+index.getName());                  
            System.out.println(" Roll number    : "+index.getRollnumber());
            System.out.println(" Class          : "+index.getStd_class());
            System.out.println(" Maths          : "+index.getScore_math());
            System.out.println(" Science        : "+index.getScore_science());
            System.out.println(" Hindi          : "+index.getScore_hindi());
            System.out.println(" English        : "+index.getScore_english());
            System.out.println(" G.K.           : "+index.getScore_gk());
            System.out.println(" Result         : "+index.getResult());
            System.out.println("===================================================");
        }
    
    }
    
}
