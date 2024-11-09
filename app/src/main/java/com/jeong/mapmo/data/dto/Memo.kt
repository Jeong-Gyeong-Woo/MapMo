package com.jeong.mapmo.data.dto

import com.jeong.mapmo.data.common.PriorityColor

//수정 상수 수정하기
data class Memo(var title:String, val longitude:Double = 0.0, val latitude:Double = 0.0, var detail: String, var priority: PriorityColor = PriorityColor.RED, var checked: Boolean = false, var expand: Boolean = false, var isClamped: Boolean = false)
