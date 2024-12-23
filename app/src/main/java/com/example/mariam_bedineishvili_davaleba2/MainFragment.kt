package com.example.mariam_bedineishvili_davaleba2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.mariam_bedineishvili_davaleba2.adapter.VPAdapter
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentMainBinding
import com.example.mariam_bedineishvili_davaleba2.fragments.ColdFragment
import com.example.mariam_bedineishvili_davaleba2.fragments.DessertsFragment
import com.example.mariam_bedineishvili_davaleba2.fragments.DoughFragment
import com.example.mariam_bedineishvili_davaleba2.fragments.HotFragment
import com.google.android.material.tabs.TabLayoutMediator


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val fList = listOf(
        ColdFragment.newInstance(),
        HotFragment.newInstance(),
        DessertsFragment.newInstance(),
        DoughFragment.newInstance()
    )
    private val tList = listOf("ცივი კერძები", "ცხელი კერძები", "დესერტები", "ცომეული")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }
    private fun init() = with(binding){
        val adapter = VPAdapter(activity as FragmentActivity, fList)
        vp.adapter = adapter
        TabLayoutMediator(tabLayout,vp) { tab, position ->
            tab.text = tList[position]
        }.attach()
    }

    companion object {

        @JvmStatic
        fun newInstance() = MainFragment()
    }
}