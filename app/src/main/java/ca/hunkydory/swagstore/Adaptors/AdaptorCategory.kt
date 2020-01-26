package ca.hunkydory.swagstore.Adaptors

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import ca.hunkydory.swagstore.Model.Category
import ca.hunkydory.swagstore.R
import kotlinx.android.synthetic.main.activity_main.*

class AdaptorCategory(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
//checks if the views have ben created first
        if (convertView == null){
//inflates empty views and assigns a view layout
            categoryView = LayoutInflater.from(context).inflate(R.layout.listview_item_category, null)
            holder = ViewHolder()
//puts the empty views into the holder
            holder.categoryImage = categoryView.findViewById(R.id.imageCategoryBackground)
            holder.categoryName  = categoryView.findViewById(R.id.txtCategoryName)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
//populates a text data into view
        val category = categories[position]
//creates an image view to be populated my an image
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
//puts the data into the holder
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
       return categories.count()
    }
//creates the viewholder
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}