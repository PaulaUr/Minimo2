package edu.upc.eetac.dsa.appminimo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import edu.upc.eetac.dsa.appminimo2.Client.ClientRetrofit;
import edu.upc.eetac.dsa.appminimo2.Client.RetroClient;
import edu.upc.eetac.dsa.appminimo2.Entity.Followers;
import edu.upc.eetac.dsa.appminimo2.Entity.GlobalData;
import edu.upc.eetac.dsa.appminimo2.Entity.List_adapter;
import edu.upc.eetac.dsa.appminimo2.Entity.RowItem;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Perfil  extends AppCompatActivity{

    private TextView textLogin, textFollowing,textRepos;
    private ListView listView;
    private ImageView imageUser;
    List<RowItem> rowItems;
    private  String login,following,avatar_url,repos,avatar_user;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
      final GlobalData globalData = (GlobalData)Perfil.this.getApplication();
        rowItems = new ArrayList<RowItem>();

        imageUser = (ImageView) findViewById(R.id.imageView);
        avatar_user = globalData.getAvatar_url();
        Glide.with(Perfil.this).load(avatar_user).into(imageUser);


        login = globalData.getUsername();
        following = globalData.getFollowing();
        repos = globalData.getPublic_repos();

       textLogin = (TextView)findViewById(R.id.textLog);

        textLogin.setText(login);

       textFollowing= (TextView)findViewById(R.id.textFollowing);
        textFollowing.setText(following);

        textRepos = (TextView)findViewById(R.id.textRepos);
        textRepos.setText(globalData.getPublic_repos());

        ClientRetrofit clientRetrofit = RetroClient.getClientRetrofit();

        Call<List<Followers>> call = clientRetrofit.list_followers(login);
        call.enqueue(new Callback<List<Followers>>() {
            @Override
            public void onResponse(Call<List<Followers>> call, Response<List<Followers>> response) {
                globalData.setFollowersList(response.body());
             //   showList_followers();

                for(int i=0; i<globalData.getFollowersList().size();i++) {
                   avatar_url = globalData.getFollowersList().get(i).getAvatar_url();
                    RowItem item = new RowItem(avatar_url, globalData.getFollowersList().get(i).getLogin());
                    rowItems.add(item);
                }
                listView = (ListView) findViewById(R.id.list);
                List_adapter adapter = new List_adapter(Perfil.this,R.layout.activity_entry, rowItems);
                listView.setAdapter(adapter);


            }
            @Override
            public void onFailure(Call<List<Followers>> call, Throwable t) {
                Log.d("onFailure", t.toString());

            }
        });

    }

   /* private void showList_followers() {

        GlobalData globalData = (GlobalData)Perfil.this.getApplication();

        for (int i = 0; i < globalData.getFollowersList().size(); i++) {
            RowItem item = new RowItem(avatar_url, globalData.getFollowersList().get(i).getLogin());
            rowItems.add(item);
        }
        listView = (ListView) findViewById(R.id.list);
        List_adapter adapter = new List_adapter(this,R.layout.activity_entry, rowItems);
        listView.setAdapter(adapter);
    }*/


}
