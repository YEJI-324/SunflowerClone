package com.hello.sunflowerclone.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class SunflowerPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments: ArrayList<Fragment> = ArrayList()

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}