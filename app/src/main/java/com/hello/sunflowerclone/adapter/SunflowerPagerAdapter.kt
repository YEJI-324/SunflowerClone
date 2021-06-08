package com.hello.sunflowerclone.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hello.sunflowerclone.GardenFragment
import com.hello.sunflowerclone.PlantListFragment

const val MY_GARDEN_PAGE_INDEX = 0
const val PLANT_LIST_PAGE_INDEX = 1
const val TOTAL_COUNT = 2

class SunflowerPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    private val fragmentList: ArrayList<Fragment> = ArrayList()

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            MY_GARDEN_PAGE_INDEX -> {
                val fragment = GardenFragment()
                fragmentList.add(MY_GARDEN_PAGE_INDEX,fragment)
                fragment
            }
            else -> {
                val fragment = PlantListFragment()
                fragmentList.add(PLANT_LIST_PAGE_INDEX, fragment)
                fragment
            }
        }
    }

    override fun getItemCount(): Int {
        return TOTAL_COUNT
    }
}