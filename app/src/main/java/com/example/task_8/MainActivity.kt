package com.example.task_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.fragment_search.*

class MainActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager
    private lateinit var infoBtn:ImageButton
    private lateinit var homeBtn:ImageButton
    private lateinit var searchBtn:ImageButton
    private lateinit var mPagerAdapter: PagerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager= findViewById(R.id.mViewPager)
        infoBtn= findViewById(R.id.button_info)
        homeBtn= findViewById(R.id.button_home)
        searchBtn= findViewById(R.id.button_search)

        mPagerAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerAdapter
        mViewPager.offscreenPageLimit = 3

        infoBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }
        homeBtn.setOnClickListener {
            mViewPager.currentItem = 1

        }

        searchBtn.setOnClickListener {

            mViewPager.currentItem = 2

        }

        mViewPager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
             }

            override fun onPageSelected(position: Int) {
                ChangingTabs(position)
            }
            }
        )

        mViewPager.currentItem = 1
        infoBtn.setImageResource(R.drawable.ic_info_pink_24dp)

    }
    private fun ChangingTabs(position : Int){
        if (position == 0){

        infoBtn.setImageResource(R.drawable.ic_info_pink_24dp)
        homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
        searchBtn.setImageResource(R.drawable.ic_search_black_24dp)

        }
        if (position == 1){

            infoBtn.setImageResource(R.drawable.ic_info_black_24dp)
            homeBtn.setImageResource(R.drawable.ic_home_pink_24dp)
            searchBtn.setImageResource(R.drawable.ic_search_black_24dp)

        }
        if (position == 2){

            infoBtn.setImageResource(R.drawable.ic_info_black_24dp)
            homeBtn.setImageResource(R.drawable.ic_home_black_24dp)
            searchBtn.setImageResource(R.drawable.ic_search_pink_24dp)
            wv.loadUrl("https://ringgoyanwar.000webhostapp.com/")

        }

    }
}
