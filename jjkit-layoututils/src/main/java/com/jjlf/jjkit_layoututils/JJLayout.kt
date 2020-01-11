package com.jjlf.jjkit_layoututils

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

object JJLayout {

    fun clFillParent(childView: View,margin: JJMargin = JJMargin()){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainHeight(childView.id,0)
        cs.constrainWidth(childView.id,0)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, margin.top)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, margin.bottom)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, margin.left)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, margin.right)
        cs.applyTo(parentView)
    }

    fun clFillParentHorizontally(childView: View, marginStart: Int = 0, marginEnd: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainWidth(childView.id,0)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, marginStart)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, marginEnd)
        cs.applyTo(parentView)
    }

    fun clFillParentVertically(childView: View, marginTop: Int = 0, marginBottom: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainHeight(childView.id,0)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, marginTop)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, marginBottom)
        cs.applyTo(parentView)
    }

    fun clTopToBottomOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, viewOfId, ConstraintSet.BOTTOM, margin)
        cs.applyTo(parentView)
    }

    fun clBottomToBottomOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.BOTTOM, viewOfId, ConstraintSet.BOTTOM, margin)
        cs.applyTo(parentView)
    }

    fun clTopToTopOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, viewOfId, ConstraintSet.TOP, margin)
        cs.applyTo(parentView)
    }

    fun clBottomToTopOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.BOTTOM, viewOfId, ConstraintSet.TOP, margin)
        cs.applyTo(parentView)
    }

    fun clStartToStartOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, viewOfId, ConstraintSet.START, margin)
        cs.applyTo(parentView)
    }

    fun clStartToEndOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, viewOfId, ConstraintSet.END, margin)
        cs.applyTo(parentView)
    }

    fun clEndToEndOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.END, viewOfId, ConstraintSet.END, margin)
        cs.applyTo(parentView)
    }

    fun clEndToStartOf(childView: View, viewOfId: Int, margin: Int = 0){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.END, viewOfId, ConstraintSet.START, margin)
        cs.applyTo(parentView)
    }

    fun clVerticalBias(childView: View,bias: Float){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setVerticalBias(childView.id,bias)
        cs.applyTo(parentView)
    }

    fun clHorizontalBias(childView: View,bias: Float){
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setHorizontalBias(childView.id,bias)
        cs.applyTo(parentView)
    }


    fun clPercentWidth(childView: View,width: Float) {
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainPercentWidth(childView.id, width)
        cs.applyTo(parentView)
    }

    fun clPercentHeight(childView: View,height: Float) {
        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainPercentHeight(childView.id, height)
        cs.applyTo(parentView)
    }

    fun clCenterInParent(childView: View) {

        val cs = ConstraintSet()
        val parentView =childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)
        cs.setVerticalBias(childView.id, 0.5f)
        cs.setHorizontalBias(childView.id, 0.5f)
        cs.applyTo(parentView)

    }

    fun clCenterInParent(childView: View,verticalBias: Float, horizontalBias: Float, margin: JJMargin) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, margin.left)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, margin.right)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, margin.top)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, margin.bottom)
        cs.setVerticalBias(childView.id, verticalBias)
        cs.setHorizontalBias(childView.id, horizontalBias)
        cs.applyTo(parentView)

    }

    fun clCenterInParentVertically(childView: View)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)
        cs.setVerticalBias(childView.id, 0.5f)
        cs.applyTo(parentView)

    }

    fun clCenterInParentHorizontally(childView: View)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        cs.setHorizontalBias(childView.id, 0.5f)

        cs.applyTo(parentView)
    }

    fun clCenterInParentVertically(childView: View,bias: Float, topMargin: Int, bottomMargin: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, topMargin)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, bottomMargin)
        cs.setVerticalBias(childView.id, bias)
          cs.applyTo(parentView)
    }

    fun clCenterInParentHorizontally(childView: View,bias: Float, startMargin: Int, endtMargin: Int)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, startMargin)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, endtMargin)
        cs.setHorizontalBias(childView.id, bias)
          cs.applyTo(parentView)
    }


    fun clCenterInParentTopVertically(childView: View) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.TOP, 0)
        cs.setVerticalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }


    fun clCenterInParentBottomVertically(childView: View)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)
        cs.setVerticalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }

    fun clCenterInParentStartHorizontally(childView: View)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.START, 0)
        cs.setHorizontalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }

    fun clCenterInParentEndHorizontally(childView: View)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        cs.connect(childView.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        cs.setHorizontalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }

    fun clCenterInTopVerticallyOf(childView: View,topId: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, topId, ConstraintSet.TOP, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, topId, ConstraintSet.TOP, 0)
        cs.setVerticalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }


    fun clCenterInBottomVerticallyOf(childView: View,bottomId: Int)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.TOP, bottomId, ConstraintSet.BOTTOM, 0)
        cs.connect(childView.id, ConstraintSet.BOTTOM, bottomId, ConstraintSet.BOTTOM, 0)
        cs.setVerticalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }

    fun clCenterInStartHorizontallyOf(childView: View,startId: Int)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, startId, ConstraintSet.START, 0)
        cs.connect(childView.id, ConstraintSet.END, startId, ConstraintSet.START, 0)
        cs.setHorizontalBias(childView.id, 0.5f)
          cs.applyTo(parentView)
    }

    fun clCenterInEndHorizontallyOf(childView: View,endId: Int)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.connect(childView.id, ConstraintSet.START, endId, ConstraintSet.END, 0)
        cs.connect(childView.id, ConstraintSet.END, endId, ConstraintSet.END, 0)
        cs.setHorizontalBias(childView.id, 0.5f)
        cs.applyTo(parentView)
    }


    fun clVisibility(childView: View,visibility: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setVisibility(childView.id, visibility)
        cs.applyTo(parentView)
    }



    fun clElevation(childView: View,elevation: Float)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setElevation(childView.id, elevation)
        cs.applyTo(parentView)
    }

  
    fun clMinWidth(childView: View,w:Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainMinWidth(childView.id,w)
        cs.applyTo(parentView)
    }

    fun clMinHeight(childView: View,h:Int)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainMinHeight(childView.id,h)
        cs.applyTo(parentView)
    }

    fun clMaxWidth(childView: View,w:Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainMaxWidth(childView.id,w)
        cs.applyTo(parentView)
    }

    fun clMaxHeight(childView: View,h:Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainMaxHeight(childView.id,h)
        cs.applyTo(parentView)
    }


    fun clWidth(childView: View,width: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainWidth(childView.id, width)
        cs.applyTo(parentView)
    }

    fun clHeight(childView: View,height: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.constrainHeight(childView.id, height)
        cs.applyTo(parentView)
    }

    fun clMargins(childView: View,margins: JJMargin)  {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setMargin(childView.id,ConstraintSet.TOP,margins.top)
        cs.setMargin(childView.id,ConstraintSet.BOTTOM,margins.bottom)
        cs.setMargin(childView.id,ConstraintSet.END,margins.right)
        cs.setMargin(childView.id,ConstraintSet.START,margins.left)
         cs.applyTo(parentView)
    }

    fun clVisibilityMode(childView: View,visibility: Int) {
        val cs = ConstraintSet()
        val parentView = childView.parent as ConstraintLayout
        cs.clone(parentView)
        cs.setVisibilityMode(childView.id, visibility)
        cs.applyTo(parentView)
    }


}
