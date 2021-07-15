package com.example.onboardingflow.fragment.onBoardingScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingflow.Base.BaseFragment
import com.example.onboardingflow.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SelectWhatYouLoveFragment : BaseFragment() {
    lateinit var fab : FloatingActionButton
    private var viewPager: ViewPager2? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_select_what_you_love, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        addListener()
    }

    private fun addListener() {
        fab.setOnClickListener {
            viewPager?.currentItem = 2
        }
    }

    private fun initViews(view: View) {
        fab = view.findViewById(R.id.floatingActionButtonSelectWhatYouLove)
        viewPager = activity?.findViewById(R.id.viewPager)
    }
}