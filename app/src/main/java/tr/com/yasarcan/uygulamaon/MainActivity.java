package tr.com.yasarcan.uygulamaon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Asker asker;
    public tankci tankci;
    String mesaj ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asker=new Asker();
        tankci=new tankci();
        TextView tex1=findViewById(R.id.textView);
        Button as=findViewById(R.id.button);
        Button tan=findViewById(R.id.button2);
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj=asker.atesEt();
                tex1.setText(mesaj);
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj=tankci.atesEt();
                tex1.setText(mesaj);
            }
        });
    }
}