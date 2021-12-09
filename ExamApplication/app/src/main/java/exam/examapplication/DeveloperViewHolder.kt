package exam.examapplication

import android.graphics.drawable.Drawable
import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class DeveloperViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val developerPhotoImageView: ImageView =
        itemView.findViewById(R.id.photo_developer)
    private val developerNameTextView: TextView = itemView.findViewById(R.id.name_developer)


    fun bind(name: String, photo: Int) {
        developerNameTextView.text = name
        developerPhotoImageView.setImageResource(photo)
    }
}