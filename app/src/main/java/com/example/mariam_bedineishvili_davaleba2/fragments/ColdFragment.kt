package com.example.mariam_bedineishvili_davaleba2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.mariam_bedineishvili_davaleba2.R
import com.example.mariam_bedineishvili_davaleba2.Recipe
import com.example.mariam_bedineishvili_davaleba2.adapter.RVAdapter
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentColdBinding

class ColdFragment : Fragment() {
    private lateinit var binding: FragmentColdBinding
    private lateinit var adapter: RVAdapter

    private val Cold = listOf(
        Recipe(
            "ნიგვზიანი ბადრიჯანი",
            "40 წუთი",
            "რთული",
            "@drawable/",
            "",
            ""),
        Recipe(
            "ფხალი",
            "20 წუთი",
            "მარტივი",
            "",
            "",
            ""),
        Recipe(
            "ცეზარი",
            "40 წუთი",
            "რთული",
            "",
            "",
            ""),

    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentColdBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRV()
    }
    private fun initRV() = with(binding){
        RVCold.layoutManager = LinearLayoutManager(activity)
        adapter = RVAdapter(Cold)
        RVCold.adapter = adapter
    }



    companion object {
        @JvmStatic
        fun newInstance() = ColdFragment()
    }
}
