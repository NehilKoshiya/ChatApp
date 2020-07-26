package Fragment;

import Notification.MyResponse;
import Notification.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAASSVHbDI:APA91bGoftAMVS6mMEodSMKUpall6bwO-daEejN6HW-JIErpHWcg5EpKha_LZqIE3fA7UgvkgzgeN1fNzU0wIEGfeiT5VzbFr8_5VKvn9WZql400oCvk9Odz82Y-RymoneobyPZDNNq_"
    })

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
