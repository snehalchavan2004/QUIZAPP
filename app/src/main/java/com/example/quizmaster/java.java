package com.example.quizmaster;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class java extends AppCompatActivity {

    TextView question;
    TextView qNo;
    TextView scores;
    ProgressBar progress;
    int index;
    int ques;
    int count = 0;

    queandansadapter[] questionbank = new queandansadapter[]{
            new queandansadapter(R.string.QUESTION_21, true),
            new queandansadapter(R.string.QUESTION_22, true),
            new queandansadapter(R.string.QUESTION_23, true),
            new queandansadapter(R.string.QUESTION_24, false),
            new queandansadapter(R.string.QUESTION_25, true),
            new queandansadapter(R.string.QUESTION_26, true),
            new queandansadapter(R.string.QUESTION_27, true),
            new queandansadapter(R.string.QUESTION_28, false),
            new queandansadapter(R.string.QUESTION_29, true),
            new queandansadapter(R.string.QUESTION_30, true)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clanguage);
        getSupportActionBar().hide();
        qNo=findViewById(R.id.queno);
        question=findViewById(R.id.question);
        scores=findViewById(R.id.score);
        progress=findViewById(R.id.progressBar6);

        ques=questionbank[index].getQue();
        question.setText(ques);

    }
    public void pressTrue(View view)
    {
        check_answer(true);
        update_screen();

    }
    public void pressFalse(View view)
    {
        check_answer(false);
        update_screen();
    }
    public void update_screen() {
        index = index + 1;
        progress.incrementProgressBy(10);
        if (index < 10) {
            qNo.setText("Q"+(index+1)+"/10");
            ques = questionbank[index].getQue();
            question.setText(ques);
            scores.setText("score-"+count+"/10");

        } else {
            AlertDialog.Builder myalertdialogue=new AlertDialog.Builder(this);
            myalertdialogue.setTitle(" Congratulations!!");
            myalertdialogue.setCancelable(false);
            myalertdialogue.setMessage(" Overall Result is"+count+" points");

            myalertdialogue.setPositiveButton("play Next one", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            myalertdialogue.show();
        }
    }
    public void check_answer(boolean userInput)
    {
        boolean  correctAns=questionbank[index].isAnswer();
        if(userInput==correctAns)
        {
            Toast.makeText(this,"Your answer is Right",Toast.LENGTH_SHORT).show();
            count=count+1;
        }
        else
        {
            Toast.makeText(this," Your answer is wrong",Toast.LENGTH_SHORT).show();
        }


    }
}
