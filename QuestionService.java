class QuestionService {

    // Class implementation goes here
    Question question[] = new Question[5];

    public QuestionService() {
        question[0] = new Question(1,"Whats is Java ?","Programming Language","Coffee","Both","None","A");
        question[1] = new Question(2,"What is JVM ?","Java Virtual Machine","Java Very Much","Just Virtual Machine","Java Version Manager","Java Virtual Machine");
        question[2] = new Question(3,"What is JDK ?","Java Development Kit","Java Design Kit","Just Development Kit","Java Deployment Kit","Java Development Kit");
        question[3] = new Question(4,"What is JRE ?","Java Runtime Environment","Java Real Environment","Just Runtime Environment","Java Remote Environment","Java Runtime Environment");
        question[4] = new Question(5,"What is an Object in OOP ?","Instance of a class","A function","A variable","A data type","Instance of a class");
    }


    public void display() {
       for(Question q : question){
             System.out.println(q);
       }
    }
}