#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_mp3_sdk_zaif_NativeLib_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}