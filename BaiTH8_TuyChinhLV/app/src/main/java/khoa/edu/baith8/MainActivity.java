package khoa.edu.baith8;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Bắp xào", 30000, "Mô tả ở đây", R.drawable.bapxao));
        dsMonAn.add(new MonAn("Khoai lang kén", 27000, "Mô tả ở đây", R.drawable.khoailangken));
        dsMonAn.add(new MonAn("Khoai lang lắc", 27000, "Mô tả ở đây", R.drawable.khoailanglac));
        dsMonAn.add(new MonAn("Khoai tây chiên", 25000, "Mô tả ở đây", R.drawable.khoaitaychien));
        dsMonAn.add(new MonAn("Mì Ý", 35000, "Mô tả ở đây", R.drawable.miy));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                MonAn monAnChon = dsMonAn.get(i);

                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}