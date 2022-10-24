#Coroutines
-keep class kotlinx.coroutines.**
-dontwarn kotlinx.coroutines.**

#Lottie
-dontwarn com.airbnb.lottie.**
-keep class com.airbnb.lottie.** {*;}

# Facebook
-keep class com.facebook.** {
   *;
}
# Appsflyer
-dontwarn com.appsflyer.AFKeystoreWrapper

-keepnames class * implements android.os.Parcelable
-keepclassmembers class * implements android.os.Parcelable {
  public static final *** CREATOR;
}
# Onesignal
-dontwarn com.onesignal.**

-keep class com.onesignal.ActivityLifecycleListenerCompat** {*;}


# Jsoup
-keep public class org.jsoup.** {
    public *;
}


