package com.quizapp071997.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.quizapp071997.quiz.R.id.question_02;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    *option_one method is called to check whether user has marked right answers or not
    * @i is a global variable that is incremented only when the user has marked correct answer
     */
    int i = 0;

    public void option_two(View view) {
        CheckBox a = (CheckBox) findViewById(R.id.optOne);
        CheckBox b = (CheckBox) findViewById(R.id.optTwo);
        CheckBox c = (CheckBox) findViewById(R.id.optThree);
        if (a.isChecked() && b.isChecked() && c.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Wrong Answer", text, image, view);
            if (i == 10)
                i = 10;
            else
                ++i;
        } else if (c.isChecked() && b.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Wrong Answer", text, image, view);
            if (i == 10)
                i = 10;
            else
                ++i;
        } else if (c.isChecked() && a.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Wrong Answer", text, image, view);
            if (i == 10)
                i = 10;
            else
                ++i;
        } else if (a.isChecked() && b.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Right Answer", text, image, view);
            if (i == 10)
                i = 10;
            else
                ++i;
        } else if (a.isChecked() || b.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Incomplete Answer", text, image, view);
        } else if (c.isChecked()) {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("Wrong Answer", text, image, view);
        } else {
            TextView text = (TextView) findViewById(R.id.text_view_1);
            ImageView image = (ImageView) findViewById(R.id.smiley);
            display("", text, image, view);
            displayone(image, view);
        }
    }

    public void option_one(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {

            case R.id.optseven:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_3);
                    ImageView image = (ImageView) findViewById(R.id.smiley3);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.opteight:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_3);
                    ImageView image = (ImageView) findViewById(R.id.smiley3);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.optnine:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_3);
                    ImageView image = (ImageView) findViewById(R.id.smiley3);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.optten:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_4);
                    ImageView image = (ImageView) findViewById(R.id.smiley4);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.opteleven:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_4);
                    ImageView image = (ImageView) findViewById(R.id.smiley4);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.opttwelve:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_4);
                    ImageView image = (ImageView) findViewById(R.id.smiley4);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.opthirteen:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_5);
                    ImageView image = (ImageView) findViewById(R.id.smiley5);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.optfouteen:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_5);
                    ImageView image = (ImageView) findViewById(R.id.smiley5);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.optfifteen:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_5);
                    ImageView image = (ImageView) findViewById(R.id.smiley5);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.optsixteen:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_6);
                    ImageView image = (ImageView) findViewById(R.id.smiley6);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.optseventeen:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_6);
                    ImageView image = (ImageView) findViewById(R.id.smiley6);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.opteighteen:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_6);
                    ImageView image = (ImageView) findViewById(R.id.smiley6);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.nineteen:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_7);
                    ImageView image = (ImageView) findViewById(R.id.smiley7);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twenty:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_7);
                    ImageView image = (ImageView) findViewById(R.id.smiley7);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.twentyone:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_7);
                    ImageView image = (ImageView) findViewById(R.id.smiley7);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentytwo:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_8);
                    ImageView image = (ImageView) findViewById(R.id.smiley8);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentythree:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_8);
                    ImageView image = (ImageView) findViewById(R.id.smiley8);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.twentyfour:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_8);
                    ImageView image = (ImageView) findViewById(R.id.smiley8);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentyfive:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_9);
                    ImageView image = (ImageView) findViewById(R.id.smiley9);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.twentysix:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_9);
                    ImageView image = (ImageView) findViewById(R.id.smiley9);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentyseven:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_9);
                    ImageView image = (ImageView) findViewById(R.id.smiley9);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentyeight:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_10);
                    ImageView image = (ImageView) findViewById(R.id.smiley10);
                    display("Wrong Answer", text, image, view);
                }
                break;
            case R.id.twentynine:
                if (i == 10)
                    i = 10;
                else
                    ++i;
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_10);
                    ImageView image = (ImageView) findViewById(R.id.smiley10);
                    display("Right Answer", text, image, view);
                }
                break;
            case R.id.thirty:
                if (checked) {
                    TextView text = (TextView) findViewById(R.id.text_view_10);
                    ImageView image = (ImageView) findViewById(R.id.smiley10);
                    display("Wrong Answer", text, image, view);
                }
                break;
        }
    }
/*
*display() method is used to display whether the answer we had marked is correct or not
*@abc carries the value whether answer we had ticked is correct or wrong
* @text it is the TextView where we display right or wrong answer
 */

    public void display(String abc, TextView text, ImageView img, View ab) {
        if (abc == "Right Answer") {
            text.setText("" + abc);
            img.setImageResource(R.drawable.smiley_good);
            img.setVisibility(ab.VISIBLE);
        } else if (abc == "Incomplete Answer") {
            text.setText("" + abc);
            img.setImageResource(R.drawable.confuse);
            img.setVisibility(ab.VISIBLE);
        } else {
            text.setText("" + abc);
            img.setImageResource(R.drawable.smiley_bad);
            img.setVisibility(ab.VISIBLE);
        }

    }
    //result method tells the overll score i.e. how much questions we have answered correctly
    public void result(View view) {
        EditText abc = (EditText) findViewById(R.id.edit_text_view);
        EditText question_2 = (EditText) findViewById(question_02);
        if (!question_2.getText().toString().isEmpty()) {
            int val = Integer.parseInt(question_2.getText().toString());
            if (val == 2) {
                ++i;
                TextView text = (TextView) findViewById(R.id.text_view_2);
                ImageView image = (ImageView) findViewById(R.id.smiley2);
                display("Right Answer", text, image, view);
            }
            else
            {
                TextView text = (TextView) findViewById(R.id.text_view_2);
                ImageView image = (ImageView) findViewById(R.id.smiley2);
                display("Wrong Answer", text, image, view);
            }
        }
        String name = abc.getText().toString();
        String result_answer = name + " your total score is: " + i + "/10";
        Toast.makeText(this, result_answer, Toast.LENGTH_SHORT).show();
        reset(view);
    }

    public void reset(View view) {
        i = 0;
        String word = "";
        EditText ab = (EditText) findViewById(R.id.question_02);
        ab.setText(word);
        EditText abc = (EditText) findViewById(R.id.edit_text_view);
        abc.setText(word);
        ImageView img_none = (ImageView) findViewById(R.id.smiley);
        displayone(img_none, view);
        TextView rg_one = (TextView) findViewById(R.id.text_view_1);
        rg_one.setText("" + word);
        ImageView img_none1 = (ImageView) findViewById(R.id.smiley2);
        displayone(img_none1, view);
        TextView rgtwo = (TextView) findViewById(R.id.text_view_2);
        rgtwo.setText("" + word);
        ImageView img_none2 = (ImageView) findViewById(R.id.smiley3);
        displayone(img_none2, view);
        TextView rgthree = (TextView) findViewById(R.id.text_view_3);
        rgthree.setText("" + word);
        ImageView img_none4 = (ImageView) findViewById(R.id.smiley4);
        displayone(img_none4, view);
        TextView rgfour = (TextView) findViewById(R.id.text_view_4);
        rgfour.setText("" + word);
        ImageView img_none5 = (ImageView) findViewById(R.id.smiley5);
        displayone(img_none5, view);
        TextView rgfive = (TextView) findViewById(R.id.text_view_5);
        rgfive.setText("" + word);
        ImageView img_none6 = (ImageView) findViewById(R.id.smiley6);
        displayone(img_none6, view);
        TextView rgsix = (TextView) findViewById(R.id.text_view_6);
        rgsix.setText("" + word);
        ImageView img_none7 = (ImageView) findViewById(R.id.smiley7);
        displayone(img_none7, view);
        TextView rgseven = (TextView) findViewById(R.id.text_view_7);
        rgseven.setText("" + word);
        ImageView img_none8 = (ImageView) findViewById(R.id.smiley8);
        displayone(img_none8, view);
        TextView rgeight = (TextView) findViewById(R.id.text_view_8);
        rgeight.setText("" + word);
        ImageView img_none9 = (ImageView) findViewById(R.id.smiley9);
        displayone(img_none9, view);
        TextView rgnine = (TextView) findViewById(R.id.text_view_9);
        rgnine.setText("" + word);
        ImageView img_none10 = (ImageView) findViewById(R.id.smiley10);
        displayone(img_none10, view);
        TextView rgten = (TextView) findViewById(R.id.text_view_10);
        rgten.setText("" + word);
        CheckBox a = (CheckBox) findViewById(R.id.optOne);
        a.setChecked(false);
        a = (CheckBox) findViewById(R.id.optTwo);
        a.setChecked(false);
        a = (CheckBox) findViewById(R.id.optThree);
        a.setChecked(false);
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.question3);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question4);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question5);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question6);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question7);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question8);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question9);
        rg1.clearCheck();
        rg1 = (RadioGroup) findViewById(R.id.question10);
        rg1.clearCheck();
    }

    public void displayone(ImageView imgreset, View ab) {
        imgreset.setVisibility(ab.INVISIBLE);
    }
}
