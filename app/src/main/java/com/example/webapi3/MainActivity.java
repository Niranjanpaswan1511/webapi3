package com.example.webapi3;

import static android.service.controls.ControlsProviderService.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button Sendbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sendbtn=findViewById(R.id.Sendbtn);
        Sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSendPostRequestClick();
            }
        });
    }

    private void btnSendPostRequestClick() {
        ApiInterFace apiInterFace=RetrofitClient.getRetrofitInstance().create(ApiInterFace.class);
        Call<User> call=apiInterFace.getUserInformtion("Niranjan","SoftWare Developer");
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.e(TAG, "Status: "+response.code());
                Log.e(TAG, "Name: "+response.body().getName());
                Log.e(TAG, "Job: "+response.body().getJob());
                Log.e(TAG, "Id: "+response.body().getId());
                Log.e(TAG, "Date: "+response.body().getCreatedAt());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
    }
}