package sg.edu.rp.c346.id22009211.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c218;
    TextView c203;
    TextView c206;
    TextView c235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.moduleView1);
        c218 = findViewById(R.id.moduleView2);
        c203 = findViewById(R.id.moduleView3);
        c206 = findViewById(R.id.moduleView4);
        c235 = findViewById(R.id.moduleView5);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C346");
                intent.putExtra("module1.2", "Android Programming");
                intent.putExtra("value", 2020);
                intent.putExtra("value2", 1);
                intent.putExtra("value3", 4);
                intent.putExtra("module1.3", "W66M");
                startActivity(intent);
            }
        });
        c218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C218");
                intent.putExtra("module1.2", "UI/UX Design for Apps");
                intent.putExtra("value", 2023);
                intent.putExtra("value2", 1);
                intent.putExtra("value3", 4);
                intent.putExtra("module1.3", "W65C");
                startActivity(intent);
            }});
        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C203");
                intent.putExtra("module1.2", "Web Appln Development in php");
                intent.putExtra("value", 2023);
                intent.putExtra("value2", 1);
                intent.putExtra("value3", 4);
                intent.putExtra("module1.3", "W65C");
                startActivity(intent);
            }});
        c206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C206");
                intent.putExtra("module1.2", "Software Development Process");
                intent.putExtra("value", 2023);
                intent.putExtra("value2", 1);
                intent.putExtra("value3", 4);
                intent.putExtra("module1.3", "W65C");
                startActivity(intent);
            }});
        c235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("module", "C235");
                intent.putExtra("module1.2", "IT Security and Management");
                intent.putExtra("value", 2023);
                intent.putExtra("value2", 1);
                intent.putExtra("value3", 4);
                intent.putExtra("module1.3", "W65C");
                startActivity(intent);
            }});
    }
}