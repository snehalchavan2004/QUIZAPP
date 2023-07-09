package com.example.quizmaster;

public class queandansadapter {
     private int que;
     private boolean answer;

     public queandansadapter(int que1,boolean ans1)
     {
          que=que1;
          answer=ans1;

     }

    public int getQue() {
        return que;
    }

    public void setQue(int que) {
        this.que = que;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
