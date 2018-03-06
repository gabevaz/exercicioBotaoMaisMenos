package fiap.com.br.exercicioum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNumeros;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumeros = findViewById(R.id.txtNumeros);
    }

    public void diminuirNumero(View view) {
        if(contador > 0){
            contador--;
            txtNumeros.setText(String.valueOf(contador));
        }else{
            Toast.makeText(this, "Numero menor que 0", Toast.LENGTH_SHORT).show();
        }
    }

    public void aumentarNumero(View view) {
        if(contador < 10){
            contador++;
            txtNumeros.setText(String.valueOf(contador));
        }else{
            Toast.makeText(this, "Numero maior que 10", Toast.LENGTH_SHORT).show();
        }
    }




}
