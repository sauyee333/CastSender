package cast.sauyee.android.com.castsender

import android.app.Activity
import android.os.Bundle
import timber.log.Timber

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.tag("widget").d("in main ---")
        setContentView(R.layout.activity_main)
    }
}
