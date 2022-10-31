package com.example.calculadorav2;



import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculadorav2.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    TextView Pantalla_,Temporal1_,Operador_,Temporal2_;
    double num_1=0,num_2=0;
    double resultado= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

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

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void escribir_numero_1(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("1");

    }
    public void escribir_numero_2(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("2");

    }
    public void escribir_numero_3(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("3");

    }
    public void escribir_numero_4(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("4");


    }
    public void escribir_numero_5(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("5");


    }
    public void escribir_numero_6(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("6");


    }
    public void escribir_numero_7(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("7");


    }
    public void escribir_numero_8(View view) {
        Pantalla_ = findViewById(R.id.pantalla);

        Pantalla_.append("8");


    }
    public void escribir_numero_9(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
         Pantalla_.append("9");


    }
    public void escribir_numero_0(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
               Pantalla_.append("4");


    }
    public void borrar(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Temporal1_ = findViewById(R.id.temporal1);
        Operador_ = findViewById(R.id.operador);
        Temporal2_ = findViewById(R.id.temporal2);
        Pantalla_.setText("");
        Temporal1_.setText("");
        Operador_.setText("");
        Temporal2_.setText("");
    }
    public void boton_sumar(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Operador_ = findViewById(R.id.operador);
        Temporal1_ = findViewById(R.id.temporal1);
        Temporal1_.setText(Pantalla_.getText());
        Operador_.setText(" + ");
        Pantalla_.setText("");
    }
    public void boton_restar(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Operador_ = findViewById(R.id.operador);
        Temporal1_ = findViewById(R.id.temporal1);
        Temporal1_.setText(Pantalla_.getText());
        Operador_.setText(" - ");
        Pantalla_.setText("");
    }
    public void boton_multiplicar(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Operador_ = findViewById(R.id.operador);
        Temporal1_ = findViewById(R.id.temporal1);
        Temporal1_.setText(Pantalla_.getText());
        Operador_.setText(" * ");
        Pantalla_.setText("");
    }
    public void boton_dividir(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Operador_ = findViewById(R.id.operador);
        Temporal1_ = findViewById(R.id.temporal1);
        Temporal1_.setText(Pantalla_.getText());
        Operador_.setText(" / ");
        Pantalla_.setText("");
    }
    public void boton_resultado(View view) {
        Pantalla_ = findViewById(R.id.pantalla);
        Operador_ = findViewById(R.id.operador);
        Temporal1_ = findViewById(R.id.temporal1);
        Temporal2_ = findViewById(R.id.temporal2);
        Temporal2_.setText(Pantalla_.getText());
        num_1 = Integer.parseInt(Temporal1_.getText().toString()) ;
        num_2 = Integer.parseInt(Temporal2_.getText().toString()) ;
        if (Operador_.getText().toString().equals(" + ")) {
             resultado = num_1 + num_2;
        }
        if (Operador_.getText().toString().equals(" - ")) {
            resultado = num_1 - num_2;
        }
        if (Operador_.getText().toString().equals(" * ")) {
            resultado = num_1 * num_2;
        }
        if (Operador_.getText().toString().equals(" / ")) {
            resultado = num_1 / num_2;
        }
        Pantalla_.setText(String.valueOf(resultado));
    }


    public void mostrar_mensaje(MenuItem item) {
        Intent mi_intent= new Intent(MainActivity.this,Acerca_de.class);
        startActivity(mi_intent);
    }
}