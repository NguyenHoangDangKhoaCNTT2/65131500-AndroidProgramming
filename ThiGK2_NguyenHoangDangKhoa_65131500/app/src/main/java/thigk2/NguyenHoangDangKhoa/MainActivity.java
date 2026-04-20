package thigk2.NguyenHoangDangKhoa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang1.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang2.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang3.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ChucNang4.class)));
    }
}