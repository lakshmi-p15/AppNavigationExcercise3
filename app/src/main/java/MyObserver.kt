import android.system.Os.connect
import android.util.Log
import androidx.lifecycle.*
import com.example.appnavigationexcercise3.LOG_TAG

class MyObserver : DefaultLifecycleObserver{

    override fun onResume(owner: LifecycleOwner) {
        connect("onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        disconnect("onPause")
    }

    private fun disconnect(message: String) {
        Log.i(LOG_TAG, message)
    }

    private fun connect(message: String) {
        Log.i(LOG_TAG, message)
    }
}