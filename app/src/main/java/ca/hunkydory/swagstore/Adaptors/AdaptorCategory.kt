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
        categoryView = LayoutInflater.from(context).inflate(R.layout.listview_item_category, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.imageCategoryBackground)
        val categoryName : TextView = categoryView.findViewById(R.id.txtCategoryName)
        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        categoryName.text = category.title

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
}