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

    private void addViews()
    {
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
        StringBuilder result = new StringBuilder();
        result.append(edtTen.getText().toString());
        result.append("\nNgày sinh: " + edtNgaySinh.getText().toString());
        switch (rdgGioiTinh.getCheckedRadioButtonId())
        {
            case R.id.rbNam:
                result.append("\nGiới tính: Nam");
                break;
            case R.id.rbNu:
                result.append("\nGiới tính: Nữ");
                break;
        }
        result.append("\nSở thích: ");
        if (cbSoThich1.isChecked())
            result.append(cbSoThich1.getText().toString());
        if (cbSoThich2.isChecked())
            result.append("; " + cbSoThich2.getText().toString());
        if (cbSoThich3.isChecked())
            result.append("; " + cbSoThich3.getText().toString());
        if (cbSoThich4.isChecked())
            result.append("; " + cbSoThich4.getText().toString());
        if (cbSoThich5.isChecked())
            result.append("; " + cbSoThich5.getText().toString());
        if (edtSoThich!=null)
            result.append("; " + edtSoThich.getText().toString());
        Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
    }


}
