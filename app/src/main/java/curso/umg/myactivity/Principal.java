package curso.umg.myactivity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Principal extends ActionBarActivity implements View.OnClickListener {
    private Button btnIrLogin,btnIrRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnIrLogin = (Button) findViewById(R.id.btnIrLogin);
        btnIrRegistro = (Button) findViewById(R.id.btnIrRegistro);

        btnIrLogin.setOnClickListener( this );
        btnIrRegistro.setOnClickListener( this );
    }

    @Override
    public void onClick(View v){
        if ( v == btnIrLogin ){
            Intent intent = new Intent(Principal.this, Login.class);
            startActivity( intent );
        }

        else if ( v == btnIrRegistro ){
            Intent intent = new Intent(Principal.this, Registro.class);
            startActivity( intent );
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
