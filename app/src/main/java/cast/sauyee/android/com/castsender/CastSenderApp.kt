package cast.sauyee.android.com.castsender

import android.app.Application
import timber.log.Timber

class CastSenderApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {
                override fun createStackElementTag(element: StackTraceElement): String? {
                    return super.createStackElementTag(element) + ":L" + element.lineNumber
                }
            })
        }
    }
}