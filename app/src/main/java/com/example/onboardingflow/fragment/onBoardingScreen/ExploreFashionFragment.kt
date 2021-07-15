package com.example.onboardingflow.fragment.onBoardingScreen

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingflow.Base.BaseFragment
import com.example.onboardingflow.R
import com.example.onboardingflow.Utils.IOnClickListener
import com.example.onboardingflow.Utils.ViewPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ExploreFashionFragment : BaseFragment() {
    lateinit var fab : FloatingActionButton
    private var viewPager: ViewPager2? = null
    var listener : IOnClickListener?  = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_explore_fashion,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initViews(view)
        addListener()


    }


    fun addListener()
    {
        fab.setOnClickListener {
            viewPager?.currentItem = 1
            if (this.listener !=null)
                System.out.println("null değil")
            else
                System.out.println("null ")
            listener?.ExploreFashionOnClick()

        }
    }
    fun setlistener(listener: IOnClickListener)
    {
        this.listener = listener
        if (this.listener !=null)
        System.out.println("null değil")
        else
            System.out.println("null ")
    }


    private fun initViews(view: View) {
        fab = view.findViewById(R.id.floatingActionButtonExploreFashion)
        viewPager = activity?.findViewById(R.id.viewPager)
    }


}