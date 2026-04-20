package thigk2.NguyenHoangDangKhoa;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang2);
        ListView listViewBaiHat = findViewById(R.id.listViewBaiHat);
        String[] danhSachBaiHat = {
                "Tiến Quân Ca",
                "Giải Phóng Miền Nam",
                "Lên Đàng",
                "Dậy Mà Đi",
                "Mùa Xuân Trên Thành Phố Hồ Chí Minh",
                "Tiến Về Hà Nội",
                "Đoàn Vệ Quốc Quân",
                "Làng Tôi",
                "Trường Sơn Đông Trường Sơn Tây",
                "Nguyễn Hoàng Đăng Khoa"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhSachBaiHat);
        listViewBaiHat.setAdapter(adapter);
    }
}