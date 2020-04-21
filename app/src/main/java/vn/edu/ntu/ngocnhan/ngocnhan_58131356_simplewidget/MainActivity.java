package vn.edu.ntu.ngocnhan.ngocnhan_58131356_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView, twGioiTinh, textView3;
    EditText edtTen, edtNgaySinh, edtSoThich;
    RadioGroup rdgGioiTinh;
    Button btnXacNhan;
    CheckBox cbSoThich1, cbSoThich2, cbSoThich3, cbSoThich4, cbSoThich5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addViews();
        addEvents();
    }

    private void addViews() {
        textView = findViewById(R.id.textView);
        twGioiTinh = findViewById(R.id.twGioiTinh);
        textView3 = findViewById(R.id.textView3);
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThich = findViewById(R.id.edtSoThich);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        cbSoThich1 = findViewById(R.id.cbSoThich1);
        cbSoThich2 = findViewById(R.id.cbSoThich2);
        cbSoThich3 = findViewById(R.id.cbSoThich3);
        cbSoThich4 = findViewById(R.id.cbSoThich4);
        cbSoThich5 = findViewById(R.id.cbSoThich5);
    }

    private void addEvents()
    {
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XacNhan();
            }
        });
    }
    private void XacNhan()
    {
        doShowInformation();
    }

    private void doShowInformation() {

        String ten=edtTen.getText()+;

        ten=ten.trim();
            Toast.makeText(MainActivity.this,"", Toast.LENGTH_LONG).show();

            return;

        }
    }


}
