package com.concur.test.imagetricks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /**
     * Android Academy Goals:
    - provide sample app
    - store large image
    - load big image
    - load big image but checking the size before loading
    - load big image which is scaled down
    - use cache
    - bitmap vs byte[] cache
    - different bitmap config
    - usage of matrix operations
    - usage of Exif for correct rotation resolution
     */

    lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageLoader = ImageLoader(applicationContext)


        my_recycler_view.apply {
            //setHasFixedSize(true)
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this@MainActivity)
            adapter = MyAdapter(imageLoader)
        }
    }


}
