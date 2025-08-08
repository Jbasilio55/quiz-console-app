import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    int score = 0;

    public QuestionService() {

       questions[0] = new Question(1, "What?", addAnswers("java", "python", "javaScript", "c++"), "java");
       questions[1] = new Question(2, "size of double", addAnswers("2", "6", "4", "8"), "8");
       questions[2] = new Question(3, "size of char", addAnswers("2", "6", "4", "8"), "2");
       questions[3] = new Question(4, "size of long", addAnswers("2", "6", "4", "8"), "8");
       questions[4] = new Question(5, "size of boolean", addAnswers("1", "2", "4", "8"), "1");

    }

    public void playQuiz(){
        int i = 0;

        for (Question question : questions) {
            System.out.println("Question no. "+ question.getId());
            System.out.println(question.getQuestion());
            for(String option : question.getOptions()){
                System.out.println("Option: "+ option);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Answer: ");
            selection[i++] = scanner.nextLine();
        }

        System.out.println("-------------------");
        System.out.print("All Answers: ");
        for(String s: selection){
            System.out.print(s+", ");
        }
        System.out.println();
    }

    public ArrayList<String> addAnswers(String a1, String a2, String a3, String a4){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
        answers.add(a4);
        return answers;
    }

    public void printScore() {
        for(int i = 0; i < questions.length; i++){
            String answer = this.questions[i].getAnswer();
            if(answer.equalsIgnoreCase(selection[i])){
                score++;
            }
        }

        System.out.println("Score: "+this.score);
    }
}
