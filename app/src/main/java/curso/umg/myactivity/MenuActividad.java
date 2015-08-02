package curso.umg.myactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Family on 31/07/2015.
 */
public class MenuActividad extends ActionBarActivity implements View.OnClickListener {
    private Button btnIrActividad,btnIrActividades,btnIrCreditos,btnIrEstadistica,btnIrSalir;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_menu_actividad);

        btnIrActividad = (Button) findViewById(R.id.btnIrActividad);
        btnIrActividades = (Button) findViewById(R.id.btnIrActividades);
        btnIrCreditos = (Button) findViewById(R.id.btnIrCreditos);
        btnIrEstadistica = (Button) findViewById(R.id.btnIrEstadistica);
        btnIrSalir = (Button) findViewById(R.id.btnIrSalir);

        btnIrActividad.setOnClickListener(this);
        btnIrActividades.setOnClickListener(this);
        btnIrCreditos.setOnClickListener(this);
        btnIrEstadistica.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = null;
        if ( v == btnIrActividad )
            intent = new Intent(MenuActividad.this,IngresoActividad.class);

        else if ( v == btnIrActividades )
            intent = new Intent(MenuActividad.this,Actividades.class);

        else if ( v == btnIrCreditos )
            intent = new Intent(MenuActividad.this,Creditos.class);

        else if ( v == btnIrEstadistica )
            intent = new Intent(MenuActividad.this,Estadistica.class);

        else if ( v == btnIrSalir)
            finish();

        startActivity(intent);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}