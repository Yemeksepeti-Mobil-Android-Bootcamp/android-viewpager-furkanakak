package com.example.onboardingflow.Utils

import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class CubeInScalingTransformation : ViewPager.PageTransformer, ViewPager2.PageTransformer {

    override fun transformPage(page: View, position: Float) {
        if (position <-1){  // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.setAlpha(0f);

        }
        else if (position <=1){ // [-1,1]

            val MIN_SCALE = 0.0f
            page.setScaleX(Math.max(MIN_SCALE,1-Math.abs(position)));
            page.setScaleY(Math.max(MIN_SCALE,1-Math.abs(position)));
            val MIN_ALPHA = 0.0f
            page.setAlpha(Math.max(MIN_ALPHA,1-Math.abs(position)));

        }
        else {  // (1,+Infinity]
            // This page is way off-screen to the right.
            page.setAlpha(0f);

        }


    }


}