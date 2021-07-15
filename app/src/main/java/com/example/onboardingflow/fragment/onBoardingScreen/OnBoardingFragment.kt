package com.example.onboardingflow.fragment.onBoardingScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingflow.Base.BaseFragment
import com.example.onboardingflow.MainActivity.MainActivity
import com.example.onboardingflow.R
import com.example.onboardingflow.Utils.CubeInScalingTransformation
import com.example.onboardingflow.Utils.IOnClickListener
import com.example.onboardingflow.Utils.ViewPagerAdapter
import me.relex.circleindicator.CircleIndicator3

class OnBoardingFragment : BaseFragment() {
    lateinit var viewPager: ViewPager2
    lateinit var indicator: CircleIndicator3
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initViews(view)
        initViewPager()
    }

    private fun initViews(view: View) {
        viewPager = view.findViewById(R.id.viewPager)
        indicator = view.findViewById(R.id.indicator)
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(requireActivity() as MainActivity)
        viewPager.setPageTransformer(CubeInScalingTransformation())
        viewPager.adapter = adapter
        indicator.setViewPager(viewPager)

        ExploreFashionFragment().setlistener(object : IOnClickListener{
            override fun ExploreFashionOnClick() {
                System.out.println("click")
            }


        })
    }




}