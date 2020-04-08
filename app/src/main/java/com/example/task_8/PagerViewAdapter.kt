package com.example.task_8

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

internal class PagerViewAdapter (fm:FragmentManager?):
        FragmentPagerAdapter(fm!!){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> {
                InfoFragment()
            }
            1-> {
                HomeFragment()
            }
            2-> {
                SearchFragment()
            }
            else -> HomeFragment()
        }
    }

    override fun getCount(): Int {

        return 3

    }
}

