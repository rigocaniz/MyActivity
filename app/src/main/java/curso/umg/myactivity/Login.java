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
public class Login extends ActionBarActivity implements View.OnClickListener {
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar = (Button)findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v == btnIngresar){
            Intent intent = new Intent(Login.this,MenuActividad.class);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
