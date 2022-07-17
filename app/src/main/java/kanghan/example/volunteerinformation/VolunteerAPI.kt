package kanghan.example.volunteerinformation

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query



private const val BASE_URL = "http://openapi.1365.go.kr/openapi/service/rest/VolunteerPartcptnService/"



// TODO (02) Use Retrofit Builder with ScalarsConverterFactory and BASE_URL

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface VolunteerApiService {
    @GET("getVltrPartcptnItem")
    fun getVolunteerData(): Call<ServerData>
}

object VolunteerAPI {
    val retrofitService : VolunteerApiService by lazy { retrofit.create(VolunteerApiService::class.java) }
}
// url: http://openapi.1365.go.kr/openapi/service/rest/VolunteerPartcptnService
//요청 변수: progrmRegistNo
// 샘플 데이터: 1269076

//interface NaverAPI {
//    @GET("v1/search/news.json")
//    fun getSearchNews(
//        @Header("X-Naver-Client-Id") clientId: String,
//        @Header("X-Naver-Client-Secret") clientSecret: String,
//        @Query("query") query: String,
//        @Query("display") display: Int? = null,
//        @Query("start") start: Int? = null
//    ): Call<ResultGetSearchNews>
//}