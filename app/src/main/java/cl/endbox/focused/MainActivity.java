package cl.endbox.focused;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaro Variables
    Button btn_registro;
    Button  btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registro = (Button) findViewById(R.id.btnRegistro);
        btn_ingresar = (Button) findViewById(R.id.btnIngresar);
        btn_ingresar.setOnClickListener(this);
        btn_registro.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, MenuDrawer.class));
    }
}
