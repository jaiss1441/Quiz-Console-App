import java.util.Scanner;

class QuestionService {

    // Class implementation goes here
    Question question[] = new Question[5];
    String userAnswers[] = new String[5];

    public QuestionService() {
        question[0] = new Question(1,"Whats is Java ?","Programming Language","Coffee","Both","None","A");
        question[1] = new Question(2,"What is JVM ?","Java Virtual Machine","Java Very Much","Just Virtual Machine","Java Version Manager","A");
        question[2] = new Question(3,"What is JDK ?","Java Development Kit","Java Design Kit","Just Development Kit","Java Deployment Kit","A");
        question[3] = new Question(4,"What is JRE ?","Java Real Environment","Java Runtime Environment","Just Runtime Environment","Java Remote Environment","B");
        question[4] = new Question(5,"What is an Object in OOP ?","Instance of a class","A function","A variable","A data type","A");
    }


    public void playQuiz() {
        int i = 0;
       for(Question q : question){
             System.out.println("Question No :" + q.getId());
                System.out.println(q.getQuestion());
                System.out.println(q.getOption1());
                System.out.println(q.getOption2()); 
                System.out.println(q.getOption3());
                System.out.println(q.getOption4());
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your answer : ");
            userAnswers[i] = sc.nextLine();
            i++;
       }
       for(String ans : userAnswers){
        System.out.println(ans);
       }
    }

    public void displayResult(){
        int score = 0;
        for(int i = 0; i < question.length; i++){
           Question que = question[i];
           String userAns = userAnswers[i];
           String correctAns = que.getAnswer();
           if(userAns.equals(correctAns)){
            score++;
           }
        }
        System.out.println("Your score is: " + score);
    }
}