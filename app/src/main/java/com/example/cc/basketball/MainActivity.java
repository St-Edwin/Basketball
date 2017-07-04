package com.example.cc.basketball;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   TextView tv;
    int count=0;
    TextView tv2;
    int count2=0;
    int count3=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void add(View view){

        count =count +1;
        display(count);
    }

    public void display(int no) {

        tv=(TextView) findViewById(R.id.textView4);

        tv.setText(""+count);

    }


   public void minus(View View){

       count3= count-1;
       show(count3);
   }
   private void show(int c) {

       tv=(TextView) findViewById(R.id.textView5);

       tv.setText(""+c);

   }
public void AA(View View){

    count2=count + 1;

    display(count2);

    tv=(TextView) findViewById(R.id.textView5);

    tv.setText(""+count2);


}

public void MINUS(View view){


    count= count2-1;
    show(count2);

}
private void display(View view){

    tv=(TextView) findViewById(R.id.textView4);

    tv.setText(""+count2);
}


}















