import java.util.ArrayList;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {

       questions[0] = new Question(1, "What?", addAnswers("java", "python", "javaScript", "c++"), "java");
       questions[1] = new Question(2, "size of double", addAnswers("2", "6", "4", "8"), "8");
       questions[2] = new Question(3, "size of char", addAnswers("2", "6", "4", "8"), "2");
       questions[3] = new Question(4, "size of long", addAnswers("2", "6", "4", "8"), "8");
       questions[4] = new Question(5, "size of boolean", addAnswers("1", "2", "4", "8"), "1");

    }

    public void displayAllQuestions(){
        for (Question question : questions) {
            System.out.println(question.toString());
        }
    }

    public ArrayList<String> addAnswers(String a1, String a2, String a3, String a4){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
        answers.add(a4);
        return answers;
    }
}
