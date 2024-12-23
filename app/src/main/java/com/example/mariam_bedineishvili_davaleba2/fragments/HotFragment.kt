package com.example.mariam_bedineishvili_davaleba2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mariam_bedineishvili_davaleba2.R
import com.example.mariam_bedineishvili_davaleba2.Recipe
import com.example.mariam_bedineishvili_davaleba2.adapter.RVAdapter
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentColdBinding
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentHotBinding


class HotFragment : Fragment() {
    private lateinit var binding: FragmentHotBinding
    private lateinit var adapter: RVAdapter

    private val Hot = listOf(
        Recipe("ლობიო", "40 წუთი", "რთული", "", "", ""),
        Recipe("ოსტრი", "30 წუთი", "საშუალო", "", "", ""),
        Recipe("შქმერული", "40 წუთი", "რთული", "", "", ""),

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHotBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRV()
    }
    private fun initRV() = with(binding){
        RVHot.layoutManager = LinearLayoutManager(activity)
        adapter = RVAdapter(Hot)
        RVHot.adapter = adapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = HotFragment()
    }
}