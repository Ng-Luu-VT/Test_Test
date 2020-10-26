package com.example.test_test


import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_fragment.view.*


class BottomSheetFragment : BottomSheetDialogFragment(){
    private var arrData: MutableList<String> = mutableListOf()

    companion object {
        fun newInstance(): BottomSheetFragment {
            return BottomSheetFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bottom_sheet_fragment, container, false)



        for (i in 1..40){
            arrData.add(i.toString())
        }

        view.rvTest.layoutManager = GridLayoutManager(activity,8)
        view.rvTest.setHasFixedSize(true)
        view.rvTest.adapter = TestAdapter(arrData)

        return view
    }


    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

    }




}