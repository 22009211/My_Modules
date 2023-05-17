package sg.edu.rp.c346.id22009211.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView moduleView;
    TextView moduleView2;
    TextView moduleView3;
    TextView moduleView4;
    TextView moduleView5;
    TextView moduleView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        moduleView = findViewById(R.id.textView);
        moduleView2 = findViewById(R.id.textView2);
        moduleView3 = findViewById(R.id.textView3);
        moduleView4 = findViewById(R.id.textView4);
        moduleView5 = findViewById(R.id.textView5);
        moduleView6 = findViewById(R.id.textView6);
        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("module");
        moduleView.setText("Module Code: " + value);
        String value2 = intentReceived.getStringExtra("module1.2");
        moduleView2.setText("Module Name: " + value2);
        int value3 = intentReceived.getIntExtra("value", 0);
        moduleView3.setText("Academic Year: " + value3);
        int value4 = intentReceived.getIntExtra("value2", 0);
        moduleView4.setText("Semester: " + value4);
        int value5 = intentReceived.getIntExtra("value3", 0);
        moduleView5.setText("Module Credit: " + value5);
        String value6 = intentReceived.getStringExtra("module1.3");
        moduleView6.setText("Venue: " + value6);
    }
}