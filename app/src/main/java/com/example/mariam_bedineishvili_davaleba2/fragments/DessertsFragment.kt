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
import com.example.mariam_bedineishvili_davaleba2.databinding.FragmentDessertsBinding

class DessertsFragment : Fragment() {

    private lateinit var binding: FragmentDessertsBinding
    private lateinit var adapter: RVAdapter
    private val Desserts = listOf(
        Recipe(
            "კექსი",
            "40 წუთი",
            "მარტივი",
            "",
            "",
            ""),
        Recipe(
            "მედოკი",
            "30 წუთი",
            "მარტივი",
            "",
            "",
            ""),
        Recipe(
            "ფელამუში",
            "30 წუთი",
            "საშუალო",
            "",
            "",
            ""),
    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDessertsBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRV()
    }
    private fun initRV() = with(binding){
        RVDessert.layoutManager = LinearLayoutManager(activity)
        adapter = RVAdapter(Desserts)
        RVDessert.adapter = adapter
    }


    companion object {
        @JvmStatic
        fun newInstance() = DessertsFragment()

    }
}