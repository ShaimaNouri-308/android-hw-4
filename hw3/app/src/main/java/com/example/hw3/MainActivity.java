package com.example.hw3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnContextClickListener;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.io.StringBufferInputStream;

        import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.quizes);
        final EditText y = findViewById(R.id.homework);
        final EditText g = findViewById(R.id.midterms);
        final EditText z = findViewById(R.id.finals);
        Button cal = findViewById(R.id.calculate);
        Button res = findViewById(R.id.reset);
        final TextView a = findViewById(R.id.a);
        final TextView b = findViewById(R.id.b);
        final TextView c = findViewById(R.id.c);
        final TextView d = findViewById(R.id.d);
        final TextView f = findViewById(R.id.f);

        cal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View j) {

                String quizesString = x.getText().toString();
                String homewoekString = y.getText().toString();
                String midtermsString = g.getText().toString();
                String finalsString = z.getText().toString();


                double quizes = Double.parseDouble(quizesString);
                double homework = Double.parseDouble(homewoekString);
                double midterms = Double.parseDouble(midtermsString);
                double finals = Double.parseDouble(finalsString);

                double grades = (quizes + homework + midterms + finals);
                if (grades >= 90)
                    a.setText("A");

                else if (grades >= 80)
                    b.setText("B");

                else if (grades >= 70)
                    c.setText("C");

                else if (grades >= 60)
                    d.setText("D");

                else
                    f.setText("F");
            }
        });

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x.setText("");
                y.setText("");
                g.setText("");
                z.setText("");
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                f.setText("");







            }
        });
    }
}
