package mp3.sdk.zaif

class NativeLib {

    /**
     * A native method that is implemented by the 'zaif' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'zaif' library on application startup.
        init {
            System.loadLibrary("zaif")
        }
    }
}