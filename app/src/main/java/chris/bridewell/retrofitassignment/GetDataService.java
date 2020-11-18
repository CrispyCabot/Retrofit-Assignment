package chris.bridewell.retrofitassignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/db.json")
    Call<List<RetroPhoto>> getAllPhotos();
}
