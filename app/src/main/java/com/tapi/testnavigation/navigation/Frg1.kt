package com.tapi.testnavigation.navigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tapi.testnavigation.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Frg1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Frg1 : Fragment() {
    private lateinit var bt1: Button
    private lateinit var rootView: View


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            LayoutInflater.from(requireContext()).inflate(R.layout.fragment_frg1, container, false)
        // Inflate the layout for this fragment
        bt1 = rootView.findViewById(R.id.bt_1)
        bt1.setOnClickListener {
            findNavController().navigate(R.id.action_frg1_to_frg2)

        }
        return rootView
    }

    override fun onAttach(context: Context) {
        Log.d("TAG", "nmLOG    onAttach: ${this.javaClass.name}")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TAG", "nmLOG    onCreate: ${this.javaClass.name} ")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "nmLOG    onStart: ${this.javaClass.name}")
    }

    override fun onResume() {
        Log.d("TAG", "nmLOG    onResume: ${this.javaClass.name}")
        super.onResume()
    }

    override fun onPause() {
        Log.d("TAG", "nmLOG    onPause: ${this.javaClass.name}")
        super.onPause()
    }

    override fun onStop() {
        Log.d("TAG", "nmLOG    onStop: ${this.javaClass.name}")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("TAG", "nmLOG    onDestroyView: ${this.javaClass.name}")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d("TAG", "nmLOG    onDestroy: ${this.javaClass.name}")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d("TAG", "nmLOG    onDetach: ${this.javaClass.name}")
        super.onDetach()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("TAG", "nmLOG    onSaveInstanceState: ${this.javaClass.name}")
        super.onSaveInstanceState(outState)
    }




}