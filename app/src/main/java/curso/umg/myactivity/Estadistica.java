package curso.umg.myactivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Family on 31/07/2015.
 */
public class Estadistica extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_estadistica);

    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
