package com.example.onboardingflow.Utils

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.onboardingflow.MainActivity.MainActivity
import com.example.onboardingflow.fragment.onBoardingScreen.BeTheRealYouFragment
import com.example.onboardingflow.fragment.onBoardingScreen.ExploreFashionFragment
import com.example.onboardingflow.fragment.onBoardingScreen.SelectWhatYouLoveFragment

private const val Fragment_Count = 3
class ViewPagerAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = Fragment_Count

    override fun createFragment(position: Int): Fragment {
       return when (position)
        {
            0 -> ExploreFashionFragment()
            1 -> SelectWhatYouLoveFragment()
           else -> BeTheRealYouFragment()

        }
    }
}