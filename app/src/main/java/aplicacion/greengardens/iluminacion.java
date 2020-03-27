package aplicacion.greengardens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class iluminacion extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;
    Button regresarPrin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iluminacion);


        Switch led = (Switch) findViewById(R.id.led); //Declaracion de la variable que contiene el id del boton switch

        // Conexion a la base de datos.
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("led");

        led.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b){
                        myRef.setValue(1);
                    }else{
                        myRef.setValue(0);
                    }
            }
        });

        //Metodo para regresar al activity principal
        regresarPrin =(Button) findViewById(R.id.regresarPrin);
        regresarPrin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent siguiente = new Intent(iluminacion.this, MainActivity.class);
                startActivity(siguiente);
            }
        });

    }

}
