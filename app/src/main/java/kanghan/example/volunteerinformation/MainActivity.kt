package kanghan.example.volunteerinformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var server_data = ServerData()
        //init {
            //getMarsRealEstateProperties()
        //}
        var server_data = VolunteerAPI.retrofitService.getVolunteerData()
        /**
         * Sets the value of the status LiveData to the Mars API status.
         */
        var test = 1

    }

    private fun getMarsRealEstateProperties() {
        //var listResult = ServerData()
        var listResult = VolunteerAPI.retrofitService.getVolunteerData()
//        try {
//            //_status.value = MarsApiStatus.LOADING
//            var listResult = VolunteerAPI.retrofitService.getVolunteerData()
//
//        } catch (e: Exception) {
//            //_status.value = MarsApiStatus.ERROR
//            //_properties.value = ArrayList()
//            var
//
//        }

    }
}