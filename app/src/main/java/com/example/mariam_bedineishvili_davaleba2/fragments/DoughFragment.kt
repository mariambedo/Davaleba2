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
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentDoughBinding

class DoughFragment : Fragment() {
    private lateinit var binding: FragmentDoughBinding
    private lateinit var adapter: RVAdapter

    private val Dough = listOf(
        Recipe("აჭარული ხაჭაპური", "90 წუთი", "რთული", "", "", ""),
        Recipe("ხინკალი", "600 წუთი", "რთული", "", "", ""),
        Recipe("პიცა", "40 წუთი", "საშუალო", "", "", ""),

        )



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDoughBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRV()
    }
    private fun initRV() = with(binding){
        RVDough.layoutManager = LinearLayoutManager(activity)
        adapter = RVAdapter(Dough)
        RVDough.adapter = adapter
    }

    companion object {

        @JvmStatic
        fun newInstance() = DoughFragment()
    }
}