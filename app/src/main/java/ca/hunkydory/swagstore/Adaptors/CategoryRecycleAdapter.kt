package ca.hunkydory.swagstore.Adaptors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ca.hunkydory.swagstore.Model.Category
import ca.hunkydory.swagstore.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.listview_item_category, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bindCategory(categories[position],context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
///get reference to ui elements
        val categoryImage: ImageView? = itemView?.findViewById<ImageView>(R.id.imageCategoryBackground)
        val categoryName: TextView? = itemView?.findViewById<TextView>(R.id.txtCategoryName)
//bind the data to those elements
        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,
                "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}

