package `in`.madapps.easypreferences.example

import `in`.madapps.prefrences.EasyPreferences
import `in`.madapps.prefrences.EasyPreferences.get
import `in`.madapps.prefrences.EasyPreferences.set
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val prefs = EasyPreferences.defaultPrefs(this)
    prefs["TestKey"] = "HelloWorld"
    val value: String? = prefs["TestKey"]
    Log.d("value=>", value)
    prefs.edit().clear().apply()
    val defaultVal: String? = prefs["TestKey", "hello"]
    Log.d("defaultValue=>", defaultVal)
  }
}
