import java.util.Scanner;

class QuestionService{
    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void play(){
        for(int i = 0; i < 5; i++){
            System.out.println(questions[i].getId() + ") " + questions[i].getQuestion() + " ?");
            System.out.println("a: " + questions[i].getOption1());
            System.out.println("b: " + questions[i].getOption2());
            System.out.println("c: " + questions[i].getOption3());
            System.out.println("d: " + questions[i].getOption4());

            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
        }
    }

    public int calcScore(){
        int count = 0;
        for(int i = 0; i < 5; i++){
            String userAns = selections[i];
            String answer = questions[i].getAnswer();
            if(userAns.equals(answer)){
                count++;
            }
        }
        return count;
    }
}