package androidpro.com.br.appaula1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Resgatamos nossos componentes pelo id
        final EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        final Button btnAcao = (Button) findViewById(R.id.buttonAcao);

        // Adicionando uma ação no clique do botão
        btnAcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegamos o conteudo do campo de texto
                String nome = editTextNome.getText().toString();

                // Mostramos uma mensagem na tela do usuário
                Toast.makeText(MainActivity.this, "Olá, " + nome + " tudo bem?", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
