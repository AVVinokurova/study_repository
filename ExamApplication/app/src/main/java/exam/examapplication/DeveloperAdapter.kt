package exam.examapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DeveloperAdapter(
    private val developersNames: List<String>,
    private val developersPhotos: List<Int>
) :
    RecyclerView.Adapter<DeveloperViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeveloperViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_list_item, parent, false)
        return DeveloperViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DeveloperViewHolder, position: Int) {
        val name = developersNames[position]
        val photo = developersPhotos[position]
        holder.bind(name, photo)

    }

    override fun getItemCount(): Int {
        return developersNames.size
    }
}