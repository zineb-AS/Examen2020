package asebriy.zineb.app;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitService {

    @GET("/eilco.json")
    Call<JSONResponse> getJSON();
}
