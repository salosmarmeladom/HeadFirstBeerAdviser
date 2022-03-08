package laba.project.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //called when the user clicks the button
    public void onClickFindBeer (View view){
        //ссылка на TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //ccылка на Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //получение выбранного варианта в Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //обращенние к классу BeerExpert
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList){
            brandsFormatted.append(brand).append('\n');
        }
        //вывод рекомендуемых сортов в TextView
        brands.setText(brandsFormatted);
    }

}