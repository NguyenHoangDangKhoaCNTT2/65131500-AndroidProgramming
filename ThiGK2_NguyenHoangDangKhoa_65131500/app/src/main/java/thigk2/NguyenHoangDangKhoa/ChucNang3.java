package thigk2.NguyenHoangDangKhoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ChucNang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuc_nang3);

        ListView listViewDanhNhan = findViewById(R.id.listViewDanhNhan);
        ArrayList<DanhNhan> list = new ArrayList<>();

        list.add(new DanhNhan("Trần Hưng Đạo", "Nam Định", R.drawable.hinh1));
        list.add(new DanhNhan("Nguyễn Trãi", "Hải Dương", R.drawable.hinh2));
        list.add(new DanhNhan("Võ Nguyên Giáp", "Quảng Bình", R.drawable.hinh3));
        list.add(new DanhNhan("Quang Trung", "Bình Định", R.drawable.hinh4));
        list.add(new DanhNhan("Hồ Chí Minh", "Nghệ An", R.drawable.hinh5));

        ArrayAdapter<DanhNhan> adapter = new ArrayAdapter<DanhNhan>(this, R.layout.item_danh_nhan, list) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_danh_nhan, parent, false);
                }

                TextView txtTen = convertView.findViewById(R.id.txtTen);
                TextView txtQueQuan = convertView.findViewById(R.id.txtQueQuan);
                ImageView imgHinh = convertView.findViewById(R.id.imgHinh);

                DanhNhan dn = list.get(position);
                txtTen.setText(dn.ten);
                txtQueQuan.setText("Quê quán: " + dn.queQuan);
                imgHinh.setImageResource(dn.hinh);

                return convertView;
            }
        };

        listViewDanhNhan.setAdapter(adapter);
    }
}