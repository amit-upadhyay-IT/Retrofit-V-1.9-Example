package amitupadhyay.com.flowerlist.web.adapter;

import retrofit.RestAdapter;
import amitupadhyay.com.flowerlist.web.service.FlowerService;

public class FlowerWebAdapter {

    public FlowerService getFlowerService() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://www.json-generator.com/api/json/get")
                .build();
        return restAdapter.create(FlowerService.class);
    }
}