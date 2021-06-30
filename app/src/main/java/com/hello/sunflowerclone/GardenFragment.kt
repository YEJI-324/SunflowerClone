package com.hello.sunflowerclone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GardenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GardenFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var tv_garden: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_garden, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_garden = view.findViewById(R.id.tv_garden)
    }

    override fun onResume() {
        super.onResume()

        tv_garden.setOnClickListener {
            Intent(Intent.ACTION_VIEW).apply {
//                data = Uri.parse("naversearchapp://default?version=5")
                data = Uri.parse("http://m.kristinkorea.com/product/project.html?cate_no=116#enp_mbris#enp_bounce&mmkpl=cashw1")
//                Intent;scheme=naversearchapp;action=android.intent.action.VIEW;category=android.intent.category.BROWSABLE;package=com.nhn.android.search;end
                //                naversearchapp://명령어?파라미터=옵션&version=버전
                //                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                //                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
//                addCategory(Intent.CATEGORY_BROWSABLE)
//                setPackage("com.nhn.android.search")
                Toast.makeText(context, "되는거니,,,,,,", Toast.LENGTH_SHORT).show()
                Log.d("donquiz", "intent : $this")
                requireContext().startActivity(this)
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GardenFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GardenFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}