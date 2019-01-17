package cast.sauyee.android.com.castsender.cast

import android.content.Context
import cast.sauyee.android.com.castsender.R
import cast.sauyee.android.com.castsender.ui.playback.PlaybackActivity
import com.google.android.gms.cast.framework.CastOptions
import com.google.android.gms.cast.framework.OptionsProvider
import com.google.android.gms.cast.framework.SessionProvider
import com.google.android.gms.cast.framework.media.CastMediaOptions
import com.google.android.gms.cast.framework.media.NotificationOptions

class CastOptionsProvider : OptionsProvider {

    override fun getCastOptions(context: Context?): CastOptions {
        val notificationOptions = NotificationOptions.Builder()
                .setTargetActivityClassName(PlaybackActivity::class.java.getName())
                .build()
        val mediaOptions = CastMediaOptions.Builder()
                .setNotificationOptions(notificationOptions)
                .setExpandedControllerActivityClassName(PlaybackActivity::class.java.getName())
                .build()

        return CastOptions.Builder()
                .setReceiverApplicationId(context?.getString(R.string.castAppId))
                .setEnableReconnectionService(true)
                .setCastMediaOptions(mediaOptions)
                .build()

    }

    override fun getAdditionalSessionProviders(context: Context?): MutableList<SessionProvider>? {
        return null
    }
}