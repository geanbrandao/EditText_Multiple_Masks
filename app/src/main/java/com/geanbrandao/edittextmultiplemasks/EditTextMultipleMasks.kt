package com.geanbrandao.edittextmultiplemasks

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.appcompat.widget.AppCompatEditText

class EditTextMultipleMask: AppCompatEditText {

    var FIRST_MASK: String? = null
    var SECOND_MASK: String? = null

    constructor(context: Context): super(context)

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {

    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr)

    override fun onTextChanged(
        text: CharSequence?,
        start: Int,
        lengthBefore: Int,
        lengthAfter: Int
    ) {
        Log.d("DEBUG3", "Teste")
    }
}
