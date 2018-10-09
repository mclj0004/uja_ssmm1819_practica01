package es.ujaen.labtelema.practica1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentAuth.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO Añadir algo aquí
        Log.d("ARRANCANDO","La aplicación móvil se está iniciando");
        FragmentManager fm =getSupportFragmentManager();
        Fragment temporal=fm.findFragmentById(R.id.main_container);
        if(temporal==null){
            FragmentTransaction ft = fm.beginTransaction();
            FragmentAuth fragment=FragmentAuth.newInstance("","");
            ft.add(R.id.main_container,fragment,"login");
            ft.commit();
        }else{
            Toast.makeText(this,getString(R.string.mainactivity_fragmentpresent),Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
