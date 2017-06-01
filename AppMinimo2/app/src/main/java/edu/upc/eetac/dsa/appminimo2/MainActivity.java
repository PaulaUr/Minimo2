package edu.upc.eetac.dsa.appminimo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import edu.upc.eetac.dsa.appminimo2.Client.ClientRetrofit;
import edu.upc.eetac.dsa.appminimo2.Client.RetroClient;
import edu.upc.eetac.dsa.appminimo2.Entity.GlobalData;
import edu.upc.eetac.dsa.appminimo2.Entity.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText) findViewById(R.id.editText);

        Button buttonExplore = (Button) findViewById(R.id.buttonExplore);
        buttonExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getbuttonExplore();
            }
        });
    }

    private void getbuttonExplore() {

        name= login.getText().toString();

        ClientRetrofit clientRetrofit = RetroClient.getClientRetrofit();
        Call<User> logiCall = clientRetrofit.usuarios(name);
        logiCall.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                GlobalData globalData = (GlobalData)MainActivity.this.getApplication();
                User user = response.body();
                globalData.setUsername(user.getLogin());
               globalData.setFollowing(user.getFollowing());
                globalData.setPublic_repos(user.getPublic_repos());
                Intent intent = new Intent(MainActivity.this, Perfil.class);
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Can't explorer", Toast.LENGTH_LONG).show();

            }
        });
    }
}
