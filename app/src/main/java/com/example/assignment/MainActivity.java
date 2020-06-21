package com.example.assignment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.assignment.apiUtils.ApiClient;
import com.example.assignment.apiUtils.ApiInterface;
import com.example.assignment.databinding.ActivityMainBinding;
import com.example.assignment.models.DataModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ApiInterface apiInterface;
    private UpcommingEventsAdapter upcommingEventsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        apiInterface = ApiClient.getClient().create(ApiInterface.class);

        initRecyclerView();
        fetchEvents();
    }

    /*initialize list views*/
    private void initRecyclerView() {
        upcommingEventsAdapter = new UpcommingEventsAdapter();
        binding.upcommingEventsRv.setAdapter(upcommingEventsAdapter);
    }

    /*fetch events list from api*/
    private void fetchEvents() {
        Call<DataModel> call = apiInterface.getEventsList();
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                if (response.isSuccessful() && response.body() != null && response.body().isStatus()) {
                    DataModel model = response.body();
                    updateUpcommingEventsAdapter(model.getUpcomingEventsBean());
                }
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {
                t.printStackTrace();
                call.cancel();
            }
        });
    }


    /*update upcomming events adapter*/
    private void updateUpcommingEventsAdapter(List<DataModel.UpcomingEventsBean> list) {
        if (list != null && !list.isEmpty()) {
            upcommingEventsAdapter.setList(list);
        }
    }
}
