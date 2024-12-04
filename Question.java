class Question{
    private int id;
    private String ques;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String ans;

    public Question(int id, String ques, String opt1, String opt2, String opt3, String opt4, String ans){
        this.id = id;
        this.ques = ques;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }

    // getters and setters
    public int getId(){
        return id;
    }
    public String getQuestion(){
        return ques;
    }
    public String getOption1(){
        return opt1;
    }
    public String getOption2(){
        return opt2;
    }
    public String getOption3(){
        return opt3;
    }
    public String getOption4(){
        return opt4;
    }
    public String getAnswer(){
        return ans;
    }


    public void setId(int id){
        this.id = id;
    }
    public void setQuestion(String ques){
        this.ques = ques;
    }
    public void setOption1(String opt1){
        this.opt1 = opt1;
    }
    public void setOption2(String opt2){
        this.opt2 = opt2;
    }
    public void setOption3(String opt3){
        this.opt3 = opt3;
    }
    public void setOption4(String opt4){
        this.opt4 = opt4;
    }
    public void setAnswer(String ans){
        this.ans = ans;
    }

// this will print the object by overridding the tostring method
    @Override
    public String toString(){
        return "Question " + id +
                ": { question='" + ques + '\'' +
                ", opt1='" + opt1 + '\'' +
                ", opt2='" + opt2 + '\'' +
                ", opt3='" + opt3 + '\'' +
                ", opt4='" + opt4 + '\'' +
                ", answer='" + ans + '\'' + '}'  ;
    }
}