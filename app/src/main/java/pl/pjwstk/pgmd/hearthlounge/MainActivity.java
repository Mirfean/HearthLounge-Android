package pl.pjwstk.pgmd.hearthlounge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import pl.pjwstk.pgmd.hearthlounge.CardsJSON.JSONTask;


public class MainActivity extends AppCompatActivity {

    private ImageButton buttonCards;
    private ListView listViewCards;
    private TextView textCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        buttonCards = (ImageButton)findViewById(R.id.button_cards);
        //textCards = (TextView)findViewById(R.id.text_cards);
        //listViewCards = (ListView)findViewById(R.id.)
        buttonCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),CardsJSON.class); //Do którego ma iść
                startActivity(startIntent);
                //new CardsJSON().execute("https://omgvamp-hearthstone-v1.p.mashape.com/cards");
            }
        });
    }
}
