package chris.bridewell.retrofitassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/CrispyCabot/RetrofitData")
    Call<List<RetroPhoto>> getAllPhotos();
}
