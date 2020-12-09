package com.tapi.testnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frg2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frg2 : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var bt1: Button
    private lateinit var rootView: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            LayoutInflater.from(requireContext()).inflate(R.layout.fragment_frg2, container, false)
        // Inflate the layout for this fragment
        bt1 = rootView.findViewById(R.id.bt_2)
        bt1.setOnClickListener {
            findNavController().navigate(R.id.frg2_backto1)
        }
        return rootView
    }

}