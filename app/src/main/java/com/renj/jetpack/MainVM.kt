package com.renj.jetpack

import android.app.Application
import android.view.View
import com.renj.jetpack.base.BaseViewModel
import com.renj.jetpack.compose.activity.ComposeMainActivity
import com.renj.jetpack.fvp.FVPActivity
import com.renj.jetpack.grid.GridLayoutActivity
import com.renj.jetpack.navigation.NavigationActivity
import com.renj.jetpack.paging.PagingListActivity
import com.renj.jetpack.room.RoomOperatorActivity

/**
 * ======================================================================
 *
 * 作者：Renj
 *
 * 创建时间：2021-10-13   14:03
 *
 * 描述：
 *
 * 修订历史：
 *
 * ======================================================================
 */
class MainVM(application: Application) : BaseViewModel(application) {

    fun clickViewPager(view: View) {
        FVPActivity.Commend.start(view.context)
    }

    fun clickNavigation(view: View) {
        NavigationActivity.Commend.start(view.context)
    }

    fun clickPaging(view: View) {
        PagingListActivity.Commend.start(view.context)
    }

    fun clickRoom(view: View) {
        RoomOperatorActivity.start(view.context)
    }

    fun clickGridLayout(view: View) {
        GridLayoutActivity.Commend.start(view.context)
    }

    fun clickCompose(view: View) {
        ComposeMainActivity.Commend.start(view.context)
    }
}