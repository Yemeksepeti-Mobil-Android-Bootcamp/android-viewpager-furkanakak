package com.example.onboardingflow.fragment.onBoardingScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.onboardingflow.Base.BaseFragment
import com.example.onboardingflow.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BeTheRealYouFragment : BaseFragment() {
   private lateinit var fab : FloatingActionButton
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_be_the_real_you,container,false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        addListener()
    }

    private fun addListener() {
       fab.setOnClickListener {
           findNavController().navigate(R.id.action_onBoardingFragment_to_finishFragment)
       }
    }

    private fun initViews(view: View) {
        fab = view.findViewById(R.id.floatingActionButtonBeTheRealYou)
    }

}