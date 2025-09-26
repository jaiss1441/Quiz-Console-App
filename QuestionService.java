class QuestionService {

    // Class implementation goes here
    Question question[] = new Question[5];

    public QuestionService() {
        
    }


    public void display() {
       for(Question q : question){
             System.out.println(q);
       }
    }
}