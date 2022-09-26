package com.guruthedev.demoproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.guruthedev.demoproject.R


class FragmentOne : Fragment() {

    private lateinit var btnNavigateFragmentTwo: MaterialButton


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        val callback = object : OnBackPressedCallback(true){
//            override fun handleOnBackPressed() {
//                findNavController().navigate(R.id.action_fragmentOne_to_fragmentTow)
//            }
//        }

    //    requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,callback)

        val view:View = inflater.inflate(R.layout.fragment_one, container, false)

        btnNavigateFragmentTwo = view.findViewById(R.id.btnNavigateFragmentTwo)

        btnNavigateFragmentTwo.setOnClickListener{

            //Navigation.findNavController(view).navigate(R.id.action_fragmentOne_to_fragmentTow)
        }

        return view
    }

}