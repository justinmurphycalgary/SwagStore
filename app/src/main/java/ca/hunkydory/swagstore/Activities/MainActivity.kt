package ca.hunkydory.swagstore.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import ca.hunkydory.swagstore.Adaptors.AdaptorCategory
import ca.hunkydory.swagstore.Model.Category
import ca.hunkydory.swagstore.R
import ca.hunkydory.swagstore.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : AdaptorCategory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = AdaptorCategory(this, DataService.categories)
        listviewCategory.adapter = adapter
    }



}
