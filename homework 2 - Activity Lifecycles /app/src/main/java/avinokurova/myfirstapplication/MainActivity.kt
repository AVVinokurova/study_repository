package avinokurova.myfirstapplication

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Роберт Рождественский")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Все начинается с любви...")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Твердят: 'Вначале было слово...'")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"А я провозглашаю снова:")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Все начинается с любви!..")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"И озаренье, и работа, глаза цветов, глаза ребенка - ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"С любви! Я это точно знаю.")
    }

}