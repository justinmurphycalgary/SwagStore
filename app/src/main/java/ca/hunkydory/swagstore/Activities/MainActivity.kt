package ca.hunkydory.swagstore.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ca.hunkydory.swagstore.Adaptors.CategoryRecycleAdapter
import ca.hunkydory.swagstore.R
import ca.hunkydory.swagstore.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//init the adapter
    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(context = this, categories = DataService.categories)
        listviewCategory.adapter = adapter 

        val layoutManager = LinearLayoutManager(this)
        listviewCategory.layoutManager = layoutManager
        listviewCategory.setHasFixedSize(true)


    }



}
