package com.example.assignment.apiUtils;

import com.example.assignment.models.DataModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/api//json-storage/bin/deddffc")
    Call<DataModel> getEventsList();
}
