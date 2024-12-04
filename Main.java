public class Main{
    public static void main(String args[]){
        QuestionService service = new QuestionService();
        service.play(); 
        int score = service.calcScore();
        System.out.println("Your total Score is: " + score);
    }
}