package laba.project.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
=======
import android.widget.Spinner;
>>>>>>> 7c15d80 (Initial commit)
import android.widget.TextView;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);



    }
    //called when the user clicks the button
    public void onClickFindBeer (View view){
        TextView brands = (TextView) findViewById(R.id.brands);
<<<<<<< HEAD
        brands.setText("Gottle of geer");
=======
        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
>>>>>>> 7c15d80 (Initial commit)
    }

}