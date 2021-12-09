package exam.examapplication

import android.os.Bundle
import android.os.SystemClock
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast


class TimerFragment : Fragment() {

    private lateinit var myChronometer: Chronometer
    private lateinit var startButton: Button
    private lateinit var resetButton: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_timer, container, false)

        val timeDurationMillis: Long = 30000

        myChronometer = view.findViewById(R.id.my_chronometer)
        startButton = view.findViewById(R.id.StartButton)
        resetButton = view.findViewById(R.id.ResetButton)

        myChronometer.isCountDown = true
        myChronometer.setOnChronometerTickListener {
            val elapsedMillis: Long = (it.base - SystemClock.elapsedRealtime())
            if (elapsedMillis in 10000..11000) {
                Toast.makeText(context, "Отдых", Toast.LENGTH_SHORT).show()
            }
            if (elapsedMillis < 0) {
                it.stop()
                Toast.makeText(context, "Ура! Занятие завершено", Toast.LENGTH_SHORT).show()
            }

        }
        startButton.setOnClickListener {
            myChronometer.base = SystemClock.elapsedRealtime() + timeDurationMillis
            myChronometer.start()
            Toast.makeText(context, "Занятие", Toast.LENGTH_SHORT).show()
        }
        resetButton.setOnClickListener {
            myChronometer.base = SystemClock.elapsedRealtime() + timeDurationMillis
        }

        return view


    }
}