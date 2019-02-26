package smktelkom.hilyyu26.multiwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity { Button btnSubmit, btnHapus;
    EditText editNama, editTahun,editAlamat,editTelepon,editEmail;

    @Override

    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);

        btnSubmit = (Button)findViewById(R.id.btnSubmit); btnHapus = (Button)findViewById(R.id.btnHapus); editNama = (EditText)findViewById(R.id.editNama); editTahun = (EditText)findViewById(R.id.editTahun); editAlamat = (EditText)findViewById(R.id.editAlamat); editTelepon = (EditText)findViewById(R.id.editTelepon); editEmail = (EditText)findViewById(R.id.editEmail);

        btnHapus.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {

            editNama.setText("");
            editTahun.setText("");
            editAlamat.setText("");

            editTelepon.setText("");
            editEmail.setText("");

        }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {

            String nama = editNama.getText().toString(); Integer tahun =
                    Integer.parseInt(editTahun.getText().toString());

            String alamat= editAlamat.getText().toString(); Integer telepon =
                    Integer.parseInt(editTelepon.getText().toString());

            String email = editEmail.getText().toString(); Intent i = null;

            i	= new Intent(MainActivity.this,Main2Activity.class); Bundle b =new Bundle(); b.putString("parse_nama", nama); b.putInt("parse_tahun", tahun); b.putString("parse_alamat",alamat); b.putInt("parse_telepon", telepon); b.putString("parse_email", email);

            i.putExtras(b);
            startActivity(i);
        }

        });
    }
}
