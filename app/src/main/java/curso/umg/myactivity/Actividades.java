package curso.umg.myactivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Family on 31/07/2015.
 */
public class Actividades extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_actividades);

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}