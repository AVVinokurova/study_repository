package exam.examapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AboutFragment : Fragment() {

    private lateinit var developersRecyclerView: RecyclerView
    lateinit var shareButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about, container, false)

        val developersNames: List<String> = listOf("Vinokurova Anastasia", "Bingley Ann")
        val developersPhotos: List<Int> = listOf(R.drawable.photo1, R.drawable.photo2)

        shareButton = view.findViewById(R.id.share_button)
        developersRecyclerView = view.findViewById(R.id.developers_recyclerView)
        developersRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        developersRecyclerView.adapter = DeveloperAdapter(developersNames, developersPhotos)

        shareButton.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,"Hi! Check out this Great app:")
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))

        }


        return view
    }


}