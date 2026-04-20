package thigk2.NguyenHoangDangKhoa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang1);

        EditText edtTien = findViewById(R.id.edtTien);
        EditText edtTiGia = findViewById(R.id.edtTiGia);
        Button btnTinh = findViewById(R.id.btnTinh);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btnTinh.setOnClickListener(v -> {
            try {
                double tien = Double.parseDouble(edtTien.getText().toString());
                double tiGia = Double.parseDouble(edtTiGia.getText().toString());
                double ketQua = tien * tiGia;
                tvKetQua.setText("Kết quả: " + ketQua + " VNĐ");
            } catch (Exception e) {
                Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}