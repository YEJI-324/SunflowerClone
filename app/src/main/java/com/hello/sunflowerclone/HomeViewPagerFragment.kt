package com.hello.sunflowerclone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.hello.sunflowerclone.adapter.MY_GARDEN_PAGE_INDEX
import com.hello.sunflowerclone.adapter.PLANT_LIST_PAGE_INDEX
import com.hello.sunflowerclone.adapter.SunflowerPagerAdapter

class HomeViewPagerFragment : Fragment() {

    private lateinit var viewPager : ViewPager2
    private lateinit var pagerAdapter : SunflowerPagerAdapter
    private lateinit var tabLayout : TabLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        viewPager = view.findViewById(R.id.view_pager)
        tabLayout = view.findViewById(R.id.tabLayout)

        initTab()

        return view
    }

    private fun initTab() {
        pagerAdapter = SunflowerPagerAdapter(this)
        viewPager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, viewPager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                tab.text = when (position) {
                    MY_GARDEN_PAGE_INDEX -> "MY GARDEN"
                    PLANT_LIST_PAGE_INDEX -> "PLANT LIST"
                    else -> null
                }
                tab.setIcon(when (position) {
                    MY_GARDEN_PAGE_INDEX -> R.drawable.garden_tab_selector
                    PLANT_LIST_PAGE_INDEX -> R.drawable.plant_list_tab_selector
                    else -> throw IndexOutOfBoundsException()
                })
            }).attach()
    }
}