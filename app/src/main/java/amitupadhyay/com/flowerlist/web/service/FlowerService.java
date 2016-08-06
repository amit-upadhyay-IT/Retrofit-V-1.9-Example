package amitupadhyay.com.flowerlist.web.service;


import retrofit.Callback;
import retrofit.http.GET;
import amitupadhyay.com.flowerlist.model.FlowersCollection;

public interface FlowerService {
    @GET("/coGUFiJJmG")
    void getFlowerList(Callback<FlowersCollection> callback);
}
