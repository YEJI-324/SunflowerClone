package com.hello.sunflowerclone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.hello.sunflowerclone.adapter.SunflowerPagerAdapter

class HomeViewPagerFragment : Fragment() {

    private lateinit var viewPager : ViewPager2
    private lateinit var pagerAdapter: SunflowerPagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        viewPager = view.findViewById(R.id.view_pager)

        initAdapter()

        return view
    }

    private fun initAdapter() {
        pagerAdapter = SunflowerPagerAdapter(this)
        viewPager.adapter = pagerAdapter
    }
}