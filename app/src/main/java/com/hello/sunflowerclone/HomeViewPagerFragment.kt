package com.hello.sunflowerclone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class HomeViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val options = navOptions {
//            anim {
//                enter = R.anim.slide_in_right
//                e
//            }
//        }

        view.findViewById<Button>(R.id.btn_view_pager)?.setOnClickListener {
            findNavController().navigate(R.id.action_view_pager_fragment_to_plant_detail_fragment)
        }
    }
}