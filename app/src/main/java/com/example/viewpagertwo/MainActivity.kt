package com.example.viewpagertwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagertwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list: MutableList<String> = ArrayList()
        list.add("This is your First Screen")
        list.add("This is your Second Screen")
        list.add("This is your Third Screen")
        list.add("This is your Fourth Screen")


        val colorList: MutableList<String> = ArrayList()
        colorList.add("#00ff00")
        colorList.add("#ff0000")
        colorList.add("#0000ff")
        colorList.add("#f0f0f0")

        // Set adapter to viewPager.
       // binding.viewPager2.adapter = ViewPageAdapter(this, list, colorList)
        val colorList2 = arrayListOf("#00ff00", "#ff0000", "#0000ff", "#f0f0f0")

        binding.viewPager2.adapter = ViewPagerAdapterTwo(this, colorList2)
    }
    override fun onBackPressed() {
        val viewPager = binding.viewPager2
        if (viewPager.currentItem == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed()
        } else {
            // Otherwise, select the previous step.
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

}