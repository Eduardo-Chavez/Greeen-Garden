package aplicacion.greengardens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguienteIlu; //Variable para redireccionar a la activity iluminacion.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Metodo para redireccionar al activity iluminación
        siguienteIlu =(Button)findViewById(R.id.btnSiguienteIlu);
        siguienteIlu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent (MainActivity.this, iluminacion.class);
                startActivity(siguiente);
            }
        });

    }
}
